package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsBalancedTree {
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
            maxHeight=0;
            isBalancedTree(root);
            if (maxHeight == 0) {
                stringBuilder.append("Yes").append("\n");
            } else {
                stringBuilder.append("No").append("\n");
            }
            t--;
        }
        System.out.println(stringBuilder);
    }

    static int maxHeight = 0;

    private static void isBalancedTree(Node root) {
        if (Math.abs(getHeight(root.left) - getHeight(root.right)) > 1) {
//            return false;
            maxHeight = 1;
        } else {
            if (root.left != null) {
                isBalancedTree(root.left);
            }
            if (root.right != null) {
                isBalancedTree(root.right);
            }
        }
    }

    private static int getHeight(Node root) {
        if (root == null) {
            return -1;
        }

        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

}
