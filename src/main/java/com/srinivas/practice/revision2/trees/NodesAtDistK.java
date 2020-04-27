package com.srinivas.practice.revision2.trees;

public class NodesAtDistK {

   static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

   static public void printNodesDown(Node root, int k) {
        if (root == null || k < -1) {
            return;
        }
        if (k == 0) {
            System.out.print(root.data + " ");
        }
        printNodesDown(root.left, k - 1);
        printNodesDown(root.right, k - 1);

    }

    static public int printNodesAtK(Node root, Node target, int k) {
        if (root == null) {
            return -1;
        }
        if (root == target) {
            printNodesDown(root, k);
            return 0;
        }
        int dl = printNodesAtK(root.left, target, k);
        if (dl != -1) {
            if (dl + 1 == k) {
                System.out.print(" " + root.data);
            } else {
                printNodesDown(root.right, k - dl - 2);
            }
            return dl + 1;
        }

        int dr = printNodesAtK(root.right, target, k);
        if (dr != -1) {
            if (dr + 1 == k) {
                System.out.print(" " + root.data);
            } else {
                printNodesDown(root.left, k - dr - 2);
            }
            return dr + 1;
        }

        return -1;
    }

    public static void main(String args[])
    {
        /* Let us construct the tree shown in above diagram */
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(4);
        root.left.right = new Node(12);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);
        Node target = root.left.right.right;
        printNodesAtK(root, target, 3);
    }


}
