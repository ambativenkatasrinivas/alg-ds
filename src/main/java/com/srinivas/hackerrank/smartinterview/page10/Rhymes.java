package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rhymes {

    static class Node {
        Node links[];
        int length;

        public Node() {
            links = new Node[26];
            length = 0;
        }
    }

    private static void insert(Node root, String str) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            if (root.links[idx] == null) {
                root.links[idx] = new Node();
            }
            root = root.links[idx];
            if (root.length < str.length()) {
                root.length = str.length();
            }
        }
    }

    private static int getMaxSuffixLength(Node root, String q) {
        for (int i = 0; i < q.length(); i++) {
            int idx = q.charAt(i) - 97;
            if (root.links[idx] != null) {
                root = root.links[idx];
            } else {
                return root.length;
            }
        }
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
            insert(trie, reverseString(str));
            n--;
        }

        int q = Integer.parseInt(bufferedReader.readLine());
        while (q > 0) {
            String queryString = bufferedReader.readLine();
            stringBuffer.append(getMaxSuffixLength(trie, reverseString(queryString))).append("\n");
            q--;
        }

        System.out.println(stringBuffer);
    }
}
