package com.srinivas.hackerrank.smartinterview.page9;


// My solution is Bst not working
public class IsBST {
    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static void createTree(int[] arr, Node root, int i) {
        if (i * 2 + 1 > arr.length) {
            return;
        }

        root.left = new Node(arr[2 * i]);
        root.right = new Node(arr[2 * i + 1]);
        createTree(arr, root.left, 2 * i);
        createTree(arr, root.right, 2 * i + 1);

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

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
//        int arr[] = {0, 156, 153, 6947, 149, 154, 1761, 7230, 9, 152};
        int arr[] = {0, 92, 10, 963, 5, 334, 928, 973, 2, 9, 263, 860};
        Node root = new Node(arr[1]);
        createTree(arr, root, 1);
        inOrder(root);
        System.out.println(isBST(root));
    }

    private static boolean isBST(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left != null) {
            if (root.left.data > root.data) {
                return false;
            }
//            } else {
//                return true;
//            }
        } else if (root.right != null) {
            if (root.right.data > root.data) {
                return false;
            }
//            else {
//                return true;
//            }

        }
        return isBST(root.left) && isBST(root.right);
    }
}
