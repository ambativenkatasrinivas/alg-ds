package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trie {
    static class Node {
        Node link[];

        public Node() {
            link = new Node[2];
            link[0] = null;
            link[1] = null;
        }
    }

    static void insert(String str, Node root) {
        for (int i = 0; i < str.length(); i++) {
            int idx = Integer.parseInt(str.charAt(i) + "");
            if (root.link[idx] == null) {
                root.link[idx] = new Node();
            }
            root = root.link[idx];
        }
    }

    static int checkBit(int n, int i) {
        if (((n >> i) & 1) == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    static int solve(Node root, int arr[], int n) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            Node temp = root;
            int max = 0;
//            for (int j = 0; j < 32; j++) {
            for (int j = 31; j >= 0; j--) {
                int bit = checkBit(arr[i], j);
                if (temp != null) {
                    if (temp.link[bit ^ 1] != null) {
                        temp = temp.link[bit ^ 1];
                        max = max + (1 << j);
                    } else {
                        if (temp.link[bit] != null) {
                            temp = temp.link[bit];
                        }
                    }
                }
            }
            if (max > ans) {
                ans = max;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
//        int[] arr = {12, 15, 9};
//        int[] arr = {13, 11, 35, 3, 32};
//        Node root = new Node();
//        for (int i = 0; i < arr.length; i++) {
//            insert(getBinary(arr[i]), root);
//        }
//        System.out.println(solve(root, arr, arr.length));

        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String ele[] = bufferedReader.readLine().split(" ");
            int arr[] = new int[ele.length];
            for (int i = 0; i < ele.length; i++) {
                arr[i] = Integer.parseInt(ele[i]);
            }
            Node root = new Node();
            for (int i = 0; i < arr.length; i++) {
                insert(getBinary(arr[i]), root);
            }
            stringBuffer.append(solve(root, arr, n)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    private static String getBinary(int n) {
        String binaryNumber = "";
        for (int i = 0; i < 32 - Integer.toBinaryString(n).length(); i++) {
            binaryNumber += "0";
        }
        return binaryNumber + Integer.toBinaryString(n);
    }

}
