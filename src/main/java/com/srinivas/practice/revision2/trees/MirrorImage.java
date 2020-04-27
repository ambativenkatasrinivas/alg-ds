package com.srinivas.practice.revision2.trees;

public class MirrorImage {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    private static void swap(Node root) {
        Node temp = root.right;
        root.right = root.left;
        root.left = temp;
    }

    private static void mirrorImage(Node root) {
        if (root == null){
            return;
        }

        swap(root);
        mirrorImage(root.left);
        mirrorImage(root.right);
    }

    private static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(" " + root.data);
        preOrder(root.left);
        preOrder(root.right);
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

        mirrorImage(root);
        preOrder(root);
    }
}
