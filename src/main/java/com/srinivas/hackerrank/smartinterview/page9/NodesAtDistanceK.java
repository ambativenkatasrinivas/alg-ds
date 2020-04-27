package com.srinivas.hackerrank.smartinterview.page9;


import java.util.ArrayList;
import java.util.List;

public class NodesAtDistanceK {
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

    private static List<Node> findPath(Node root, int data) {
        List<Node> list = new ArrayList<>();
        while (root != null && root.data != data) {
            list.add(root);
            if (root.data > data) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        list.add(root);
        return list;
    }

    private static int countAtDistK(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        return countAtDistK(root.left, k - 1) + countAtDistK(root.right, k - 1);
    }

    public static void main(String[] args) {
//        int[] arr = {4, 5, 15, 0, 1, 7, 17};
//        Node root = createTree(arr);
//        List<Node> list = findPath(root, 5);
//        for (Node node : list) {
//            System.out.println(node.data);
//        }
//        int k = 2;
//
//        System.out.println("count at: " + list.get(list.size() - 1).data + " Distance: " + k + " = " + countAtDistK(list.get(list.size() - 1), k));
//
//        for (int i = list.size() - 1 - 1; i >= 0; i--) {
//            int k1 = k - list.size() + i;
//            if (list.get(i).left == list.get(i+1)) {
//                System.out.println("count at: " + list.get(i).right.data + " Distance: " + k1 + " = " + countAtDistK(list.get(i).right, k1));
//            } else {
//                System.out.println("count at: " + list.get(i).left.data + " Distance: " + k1 + " = " + countAtDistK(list.get(i).left, k1));
//            }
//        }

        int[] arr = {2, 4, 3, 1, 5 };
        Node root = createTree(arr);
        List<Node> list = findPath(root, 4);
        for (Node node : list) {
            System.out.println(node.data);
        }
        int k = 1;

        System.out.println("count at: " + list.get(list.size() - 1).data + " Distance: " + k + " = " + countAtDistK(list.get(list.size() - 1), k));

        for (int i = list.size() - 1 - 1; i >= 0; i--) {
            int k1 = k - list.size() + i;
            if (k1 < 0) {
                // increment ans by 1
                // break;
                System.out.println("count at: " + list.get(i).data + " Distance: " + 0 + " = " + 1);
                break;
            }
            if (list.get(i).left == list.get(i+1)) {
                System.out.println("count at: " + list.get(i).right.data + " Distance: " + k1 + " = " + countAtDistK(list.get(i).right, k1));
            } else {
                System.out.println("count at: " + list.get(i).left.data + " Distance: " + k1 + " = " + countAtDistK(list.get(i).left, k1));
            }
        }

    }
}
