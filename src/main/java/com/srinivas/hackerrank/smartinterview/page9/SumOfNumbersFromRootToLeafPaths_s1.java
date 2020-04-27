package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbersFromRootToLeafPaths_s1 {

    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node createTree(int[] arr) {
        Node root = null;
        for (int data : arr) {
            root = insert(root, data);
        }
        return root;
    }

    private static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] strings = bufferedReader.readLine().split(" ");
            int[] arr = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                arr[i] = Integer.parseInt(strings[i]);
            }
            Node root = createTree(arr);
            stringBuilder.append(sonfrtlp(root, 0));
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static int sonfrtlp(Node root, long sum) {

        if (root.left == null && root.right == null) {
            return new Double((new Double((sum%(1e9+7) * getBase(root.data)%(1e9+7))%(1e9+7))%(1e9+7) + root.data % (1e9 + 7))%(1e9+7)).intValue();

        }

        return new Double((((root.left != null ? sonfrtlp(root.left,  new Double((new Double(root.data % (1e9 + 7)) + new Double((new Double(getBase(root.data)% (1e9 + 7) * sum% (1e9 + 7))% (1e9 + 7)) % (1e9 + 7)).intValue()) % (1e9 + 7)).intValue()) : 0) % (1e9 + 7)) +
                ((root.right != null ? sonfrtlp(root.right, new Double((new Double(root.data % (1e9 + 7)) + new Double((new Double(getBase(root.data)% (1e9 + 7) * sum% (1e9 + 7))% (1e9 + 7)) % (1e9 + 7)).intValue()) % (1e9 + 7)).intValue()) : 0) % (1e9 + 7))) % (1e9 + 7)).intValue();
    }

    private static int getBase(int n) {
        return (int) Math.pow(10, countDigits(n));
    }

    private static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
}
