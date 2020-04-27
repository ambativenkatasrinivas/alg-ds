package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TreeTraversals {
    private static class Node {
        Node left, right;
        int data;
        int depth;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }

    }


    /**
     * Depth of a tree
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] strings = bufferedReader.readLine().split(" ");
            int[] arr = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                arr[i] = Integer.parseInt(strings[i]);
            }
            Node root = createTree(arr);
            fillDepth(root, 0);
            for (int i=0;i<arr.length;i++) {
                stringBuilder.append(map.get(arr[i])+" ");

            }

            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }
  private static Map<Integer, Integer> map = new HashMap<>();

    private static void fillDepth(Node root, int d) {

        if (root == null)
            return;
        root.depth = d;
        map.put(root.data, d);
        fillDepth(root.left,d+1);
        fillDepth(root.right,d+1);
    }


//    /**
//     * Height of a tree
//     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(bufferedReader.readLine());
//        while (t > 0) {
//            int n = Integer.parseInt(bufferedReader.readLine());
//            String[] strings = bufferedReader.readLine().split(" ");
//            int[] arr = new int[strings.length];
//            for (int i = 0; i < strings.length; i++) {
//                arr[i] = Integer.parseInt(strings[i]);
//            }
//            stringBuilder.append(heightOfTree(createTree(arr))).append("\n");
//            t--;
//        }
//        System.out.println(stringBuilder);
//    }

    /**
     * Tree Traversal
     */
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(bufferedReader.readLine());
//        while (t > 0) {
//            int n = Integer.parseInt(bufferedReader.readLine());
//            String[] strings = bufferedReader.readLine().split(" ");
//            int[] arr = new int[strings.length];
//            for(int i=0;i<strings.length;i++) {
//                arr[i] = Integer.parseInt(strings[i]);
//            }
//            treeTraversals(arr);
//            t--;
//        }
//        System.out.println(stringBuilder);
//    }

    private static StringBuilder stringBuilder = new StringBuilder();

    private static Node createTree(int[] arr) {
        Node root = null;
        for (int data : arr) {
            root = insert(root, data);
        }
        return root;
    }

    private static void treeTraversals(int[] arr) {
        Node root = null;
        for (int data : arr) {
            root = insert(root, data);
        }
        preOrder(root);
        stringBuilder.append("\n");
        inOrder(root);
        stringBuilder.append("\n");
        postOrder(root);
        stringBuilder.append("\n\n");
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

    private static int heightOfTree(Node root) {
        if (root == null) {
            return -1;
        }

        return 1 + Math.max(heightOfTree(root.left), heightOfTree(root.right));
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        stringBuilder.append(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        stringBuilder.append(root.data + " ");
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        stringBuilder.append(root.data + " ");
        inOrder(root.right);
    }
}
