package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNumbersFromRootToLeafPaths {

    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node createTree(int[] arr) {
        Node root = null;
        for (int data : arr) {
            root = insert(root, data);
        }
        return root;
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

    public static void main(String[] args) throws IOException {
//        int arr[] = {4, 5, 15, 2, 1, 7, 17};
//        Node root = createTree(arr);
//        System.out.println(sonfrtlp(root, ""));
        StringBuilder stringBuilder = new StringBuilder();
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
            stringBuilder.append(sonfrtlp(root, ""));
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static int sonfrtlp(Node root, String sum) {

        if (root.left == null && root.right == null) {
//            System.out.println(sum+root.data);
            return Integer.parseInt(sum+root.data);
        }
//        if (root.left != null)
//        sonfrtlp(root.left, sum+root.data);
//        if (root.right != null)
//        sonfrtlp(root.right, sum+root.data);
        return new Double((((root.left!=null ? sonfrtlp(root.left, sum+root.data) : 0) %(10e9+7)) + ((root.right != null ? sonfrtlp(root.right, sum+root.data) : 0)%(10e9+7)))%(10e9+7)).intValue();
    }
}
