package com.srinivas.smartinterview.week9.day2;

public class NoOfDistRows {

    static class Node {
        Node links[];

        public Node() {
            links = new Node[2];
        }
    }

    public static boolean insert(String row, Node root) {
        boolean isDuplicate = false;
        for (int i = 0; i < row.length(); i++) {
            int idx = Integer.parseInt(row.charAt(i) + "");
            if (root.links[idx] == null) {
                if (!isDuplicate) {
                    isDuplicate = true;
                }
                root.links[idx] = new Node();
            }
            root = root.links[idx];
        }
        return isDuplicate;
    }

    public static void main(String[] args) {
        Node root = new Node();
        int distCount = 0;
        String[] arr = {"0011010","1011110","0011010","0011010","0011101","1011011","1011110","1011110","1111110","0111110"};
        for (String row: arr) {
            if (insert(row,root)) {
                distCount++;
            }
        }

        System.out.println("Distinct rows= "+distCount);
    }
}
