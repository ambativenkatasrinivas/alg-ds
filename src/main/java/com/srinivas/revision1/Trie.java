package com.srinivas.revision1;

// In a given array count no.of strings have required prefix
public class Trie {
    static class Node {
        int count;
        Node[] link;

        public Node() {
            count = 0;
            link = new Node[27];
            for (int i = 1; i < link.length; i++) {
                link[i] = null;
            }
        }
    }

    public static void create(String str, Node root) {
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            if (root.link[idx] == null) {
                root.link[idx] = new Node();
            }
            root.count++;
            root = root.link[idx];
        }
    }

    public static int getCount(String subString, Node root) {
        for (int i = 0; i < subString.length(); i++) {
            int idx = subString.charAt(i) - 97;
            if (root != null) {
                root = root.link[idx];
            } else {
                return 0;
            }
        }
        return root.count;
    }

    public static void main(String[] args) {
        String arr[] = {"abba", "abbb", "abbc", "abbd", "abaa", "abca"};
        String subString = "abb";
        Node root = new Node();
        for (int i = 0; i < arr.length; i++) {
            create(arr[i], root);
        }
        System.out.println(getCount(subString, root));
    }
}
