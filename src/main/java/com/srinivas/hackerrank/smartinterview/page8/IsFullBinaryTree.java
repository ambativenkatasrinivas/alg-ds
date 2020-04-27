package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsFullBinaryTree {
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
            if(isFullBinaryTree(root)) {
                stringBuilder.append("True");
            } else {
                stringBuilder.append("False");
            }

            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length()-1));
    }

    static boolean isFullBinaryTree(Node root) {

        if (root == null) {
            return false;
        }

        if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
            return false;
        }

        if (root.left != null) {
            return isFullBinaryTree(root.left);
        }

        if (root.right != null) {
            return isFullBinaryTree(root.right);
        }
        return true;
    }
}
