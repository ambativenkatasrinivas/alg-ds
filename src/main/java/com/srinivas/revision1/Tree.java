package com.srinivas.revision1;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Tree {

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
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
        Node root = new Node(3);

        Node l1 = new Node(-1);
        Node r1 = new Node(15);
        root.left = l1;
        root.right = r1;

        l1.left = new Node(7);
        l1.right = new Node(19);

        l1.right.left = new Node(8);
        l1.right.right = new Node(11);

        r1.left = new Node(13);
        r1.right = new Node(27);

        r1.right.left = new Node(2);
        r1.right.right = new Node(9);

        r1.right.right.left = new Node(19);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
