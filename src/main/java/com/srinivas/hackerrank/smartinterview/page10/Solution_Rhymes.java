package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_Rhymes {
    static class Node {
        Node links[];
        int noofChild;
        int length;

        public Node() {
            links = new Node[26];
            noofChild = 0;
            length = 0;
        }
    }

    private static void insert(Node root, String str) {
//        for (int i = 0; i < str.length(); i++) {
        for (int i = str.length() - 1; i >= 0; i--) {
            int idx = str.charAt(i) - 97;
            if (root.links[idx] == null) {
                root.links[idx] = new Node();
            }
            root = root.links[idx];
            root.noofChild = root.noofChild + 1;
            if (root.length < str.length()) {
                root.length = str.length();
            }
        }
    }

    private static int getMaxSuffixLength(Node root, String q) {
        for (int i = q.length() - 1; i >= 0; i--) {
            int idx = q.charAt(i) - 97;
            if (root.links[idx] != null && root.noofChild != 1) {
                root = root.links[idx];
            } else {
                return root.length;
            }
        }
//        if (root.links[q.charAt(q.length()-1)-97] != null) {
//            return root.links[q.charAt(q.length()-1)-97].length;
//        } else {
//            return 0;
//        }
        return root.length;
    }

    static String reverseString(String str) {
        String strReverse = "";
        for (int i = 0; i < str.length(); i++) {
            strReverse = str.charAt(i) + strReverse;
        }
        return strReverse;
    }

    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Node trie = new Node();
        while (n > 0) {
            String str = bufferedReader.readLine();
            insert(trie, str);
            n--;
        }

        int q = Integer.parseInt(bufferedReader.readLine());
        while (q > 0) {
            String queryString = bufferedReader.readLine();
            stringBuffer.append(getMaxSuffixLength(trie, queryString)).append("\n");
            q--;
        }

        System.out.println(stringBuffer);
    }
}
