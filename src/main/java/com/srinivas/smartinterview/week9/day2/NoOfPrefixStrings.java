package com.srinivas.smartinterview.week9.day1;

public class NoOfPrefixStrings {

    static class Node {
        int count;
        Node[] links;

        public Node() {
            count = 0;
            links = new Node[26];
//            for (int i = 0; i < 26; i++) {
//                links[i] = new Node();
//            }
        }
    }

    public static void insert(String str, Node root) {


        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i) - 97;
            if (root.links[idx] == null) {
                root.links[str.charAt(i) - 97] = new Node();
            }
            root.count++;
            root = root.links[idx];
        }
    }

    public static int count(String q, Node root) {
        for (int i = 0; i < q.length(); i++) {
            int idx = q.charAt(i) - 97;
            if (root.links[idx] != null) {
                root = root.links[idx];
            } else {
                return 0;
            }
        }
        return root.count;
    }

    public static void main(String[] args) {
        String[] arr = {"cabcada", "axbaya", "abcaax", "abcab", "xyabac", "axyzbac", "axyyzb", "xyazbc"};
        Node root = new Node();
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i], root);
        }

        System.out.println("count of abc= "+count("abc", root));
        System.out.println("count of ax= "+count("ax", root));
        System.out.println("count of a= "+count("a", root));
        System.out.println("count of xy= "+count("xy", root));
        System.out.println("count of ca= "+count("ca", root));
        System.out.println("count of cbx= "+count("cbx", root));
    }

}
