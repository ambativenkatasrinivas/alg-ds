package com.srinivas.revision1;

import java.util.ArrayList;
import java.util.List;

public class NodesAtDistanceK {
    public static void main(String[] args) {
        int[] arr = {20, 8, 22, 4, 12, 10, 14};
        int k = 2;
        Node root = createTree(arr);
        List<Node> path = findPath(root, 8);
        System.out.println("Path: ");
        for (Node temp : path) {
            System.out.print(temp.data + " ");
        }
        System.out.println();
        System.out.println("--------------");



        System.out.println("Count= "+countAtDistanceK(path, k));
    }

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static int countAtDistanceK(List<Node> path, int k) {
        int ans = 0;
        ans += countNodes(path.get(path.size() - 1), k);
        int pathLength = path.size();
        for (int i = path.size() - 2; i >= 0; i--) {
            Node currentRoot = path.get(i);
            int k1 = k - pathLength + i;
            if (currentRoot.left == path.get(i + 1)) {
                ans += countNodes(currentRoot.right, k1);
            } else {
                ans += countNodes(currentRoot.left, k1);
            }

        }
        return ans;
    }

    public static int countNodes(Node root, int k) {
        if (root == null) {
            return 0;
        }
        if (k == 0) {
            return 1;
        }
        return countNodes(root.left, k - 1) + countNodes(root.right, k - 1);
    }

    public static List<Node> findPath(Node root, int data) {
        List<Node> list = new ArrayList<>();
        while (root != null && root.data != data) {
            list.add(root);
            if (root.data < data) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        list.add(root);
        return list;
    }

    private static Node createTree(int[] arr) {
        Node root = null;
        for (int data : arr) {
            root = insert(root, data);
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

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (root.data < data) {
            root.right = insert(root.right, data);
        } else {
            root.left = insert(root.left, data);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
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

    private static Node getMax(Node root) {
        if (root.right == null) {
            return root;
        } else {
            return getMax(root.right);
        }
    }

    public static Node delete(Node root, int key) {
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
