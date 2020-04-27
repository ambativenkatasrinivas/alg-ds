package com.srinivas.practice.revision1.trees;

public class BST {

    private static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
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

    private static Node create(int[] arr) {
        Node root = null;
        root = insert(root, arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }
        return root;
    }

    private static void delete(Node root, int delete) {

        if (root.data == delete) {
            if (root.left == null && root.right == null) {
                root = null;
            }

        } else if (root.data > delete) {
            delete(root.left, delete);
        } else {
            delete(root.right, delete);
        }
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 3, 1, 0, 15, 7, 6, 17, 18};
        Node root = create(arr);
        preOrder(root);
        delete(root, 18);
        System.out.println();
        preOrder(root);
    }
}
