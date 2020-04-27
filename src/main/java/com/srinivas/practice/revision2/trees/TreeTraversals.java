package com.srinivas.practice.revision2.trees;

public class TreeTraversals {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }
    }

    private static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(" "+root.data);
    }

    private static void inOrder(Node root) {

        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(" "+root.data);
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(3);
        Node l1l = new Node(-1);
        Node l1r = new Node(15);

        root.left = l1l;
        root.right = l1r;

        l1l.left = new Node(7);
        l1l.right = new Node(19);
        l1l.right.left = new Node(8);
        l1l.right.right = new Node(11);

        l1r.left = new Node(13);
        l1r.right = new Node(27);
        l1r.right.left = new Node(2);
        l1r.right.right = new Node(9);
        l1r.right.right.left = new Node(19);

        preOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        inOrder(root);

    }
}
