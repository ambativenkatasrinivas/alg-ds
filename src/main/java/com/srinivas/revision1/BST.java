package com.srinivas.revision1;

import jdk.nashorn.internal.objects.NativeObject;

public class BST {
    public static void main(String[] args) {
        BST bst = new BST();
        Node root = bst.insert(null, 40);
        bst.inOrder(root);
        System.out.println();
        bst.insert(root, 20);
        bst.insert(root, 60);
        bst.inOrder(root);
        System.out.println();
        bst.insert(root, 10);
        bst.insert(root, 30);
        bst.insert(root, 50);
        bst.insert(root, 70);
        bst.inOrder(root);
        System.out.println();
        System.out.println(70 + " exists: " + bst.search(root, 70));
        System.out.println(100 + " exists: " + bst.search(root, 100));
        bst.delete(root, 40);
        System.out.println("After delete 40");
        bst.inOrder(root);
        System.out.println();
        bst.delete(root, 70);
        System.out.println("After delete 70");
        bst.inOrder(root);
        bst.delete(root, 60);
        System.out.println("After delete 60");
        bst.inOrder(root);
    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        } else {
            inOrder(root.left);
            System.out.print(" " + root.data);
            inOrder(root.right);
        }
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        } else {
            if (root.data < key) {
                search(root.right, key);
            } else {
                search(root.left, key);
            }
            return true;
        }
    }

    private Node getMax(Node root) {
        if (root.right == null) {
            return root;
        } else {
            return getMax(root.right);
        }
    }

    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (root.data < key) {
            root.right = delete(root.right, key);
        } else if (root.data > key) {
            root.left = delete(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.right == null) {
                return root.left;
            } else if (root.left == null) {
                return root.right;
            } else {
                Node temp = getMax(root.left);
                root.data = temp.data;
                root.left = delete(root.left, temp.data);
            }
        }
        return root;
    }
}
