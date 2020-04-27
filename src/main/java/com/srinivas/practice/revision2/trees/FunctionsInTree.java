package com.srinivas.practice.revision2.trees;

public class FunctionsInTree {

    static class Node {
        int data;
        int depth;
        Node left, right;

        public Node(int data) {
            depth = 0;
            this.data = data;
            left = right = null;
        }
    }

    private static int count(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }

    private static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
    }

    public static int maxNode(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max(root.data, Math.max(maxNode(root.left), maxNode(root.right)));
    }

    private static int height(Node root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static void fillDepth(Node root, int depth) {
        if (root == null) {
            return;
        }
        root.depth = depth;
        fillDepth(root.left, depth + 1);
        fillDepth(root.right, depth + 1);
    }

    private static void preOrder(Node root) {

        if (root == null) {
            return;
        }

        System.out.print(" " + root.data+" Depth= "+root.depth);
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

        System.out.println("Count= " + count(root));
        System.out.println("Sum= " + sum(root));
        System.out.println("Max Node= " + maxNode(root));
        System.out.println("Height= " + height(root));
        fillDepth(root,0);
        System.out.println("PreOrder with depth :");
        preOrder(root);
    }
}
