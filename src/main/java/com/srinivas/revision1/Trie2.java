package com.srinivas.revision1;

// Print unique rows in given matrix
public class Trie2 {
    static class Node {
        Node link[];

        public Node() {
            link = new Node[2];
            link[0] = null;
            link[1] = null;
        }
    }

    public static boolean insert(String str, Node root) {
        boolean isDuplicate = false;
        for (int i = 0; i < str.length(); i++) {
            int idx = Integer.parseInt(str.charAt(i) + "");
            if (root.link[idx] == null) {
                root.link[idx] = new Node();
                isDuplicate = true;
            }
            root = root.link[idx];
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        String[] matrix = {"01001", "10110", "01001", "11100"};
        Node root = new Node();
        for (int i = 0; i < matrix.length; i++) {
            if (insert(matrix[i], root)) {
                System.out.println(matrix[i]);
            }
        }
    }
}
