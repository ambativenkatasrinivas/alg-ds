package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsBST_s1 {
    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static void createTree(int[] arr, Node root, int i) {
        if (i* 2 > arr.length || i * 2 + 1 > arr.length) {
            return;
        }
        if (i * 2 + 1 == arr.length){
            root.left = new Node(arr[2 * i]);
            return;
        }
        root.left = new Node(arr[2 * i]);
        root.right = new Node(arr[2 * i + 1]);
        createTree(arr, root.left, 2 * i);
        createTree(arr, root.right, 2 * i + 1);
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args) throws IOException {
//        int arr[] = {0, 156, 153, 6947, 149, 154, 1761, 7230, 9, 152};
//        int arr[] = {0, 92, 10, 963, 5, 334, 928, 973, 2, 9, 263, 860};
//        int arr[] = {0,40, 49, 87, 651};
//        Node root = new Node(arr[1]);
//        createTree(arr, root, 1);
//        inOrder(root);
//        System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String ele[] = bufferedReader.readLine().split(" ");
            int arr[] = new int[ele.length+1];
            arr[0] = 0;
            for (int i=1;i<arr.length;i++) {
                arr[i] = Integer.parseInt(ele[i-1]);
            }
            Node root = new Node(arr[1]);
            createTree(arr, root ,1);
            if (isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }


            t--;
        }

    }

    private static boolean isBST(Node root, int min, int max) {
        if (root == null) {
            return true;
        }
        if (root.data > max) {
            return false;
        }
        if (root.data < min) {
            return false;
        }

        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
}
