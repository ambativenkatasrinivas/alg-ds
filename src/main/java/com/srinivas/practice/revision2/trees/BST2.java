package com.srinivas.practice.revision2.trees;

public class BST2 {

    static class Node {
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

        if (root.data < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    private static boolean isExist(Node root, int data) {

        return false;
    }

    private static Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }

        if (root.data < data) {
            root.right = delete(root.right, data);
        } else if (root.data > data) {
            root.left = delete(root.left, data);
        } else {
            // case 1: if both childes are null
            if (root.left == null && root.right == null) {
                return null;
            } else
                // case 2: if either left is null nor right is null
                if (root.left == null && root.right != null) {
                    return root.right;
                } else if (root.right == null && root.left != null) {
                    return root.left;
                } else {
                    int max = maxNode(root.left);
                    root.data = data;
                    root.left = delete(root.left, max);
                }
        }
        return root;
    }

    public static int maxNode(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = insert(null, 3);
        insert(root, -1);
        insert(root, 15);
        insert(root, 7);
        insert(root, 8);
        insert(root, 11);
        insert(root, 13);
        insert(root, 27);
        insert(root, 2);
        insert(root, 9);
        insert(root, 19);
        inOrder(root);
//        System.out.println();
//        delete(root, -1);
//        inOrder(root);
        delete(root, 19);
        System.out.println();
        inOrder(root);
        delete(root, -1);
        System.out.println();
        inOrder(root);

    }
}
