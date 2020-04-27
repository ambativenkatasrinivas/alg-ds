package com.srinivas.revision1;

public class MirrorImageOfTree {

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node mirrorImage(Node root) {
        if (root == null) {
            return null;
        } else {
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            mirrorImage(root.left);
            mirrorImage(root.right);
        }
        return root;
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(" " + root.data);
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        } else {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(" " + root.data);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        Node l1 = new Node(2);
        Node r1 = new Node(3);
        root.left = l1;
        root.right = r1;

        l1.left = new Node(4);
        l1.right = new Node(5);

//        l1.right.left = new Node(8);
//        l1.right.right = new Node(11);

        r1.left = new Node(6);
        r1.right = new Node(7);

//        r1.right.left = new Node(2);
//        r1.right.right = new Node(9);

//        r1.right.right.left = new Node(19);
        System.out.println();
        preOrder(root);
        System.out.println();
        mirrorImage(root);
        preOrder(root);
    }
}
