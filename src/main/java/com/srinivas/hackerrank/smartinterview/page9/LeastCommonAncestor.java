package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeastCommonAncestor {
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
//        int arr[] = {4, 5, 15, 0, 1, 7, 17};
//        Node root = createTree(arr);
//        System.out.println(leastCommonAncestor(root, 17, 4).data);
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String nq[] = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(nq[0]);
            int q = Integer.parseInt(nq[1]);
            String ele[] = bufferedReader.readLine().split(" ");
            int arr[] = new int[ele.length];
            for (int i = 0; i < ele.length; i++) {
                arr[i] = Integer.parseInt(ele[i]);
            }
            Node root = createTree(arr);
            while (q > 0) {
                String query[] = bufferedReader.readLine().split(" ");
                Node lca = leastCommonAncestor(root, Integer.parseInt(query[0]), Integer.parseInt(query[1]));
                if (lca != null) {
                    stringBuffer.append(lca.data).append(" ");
                } else {
                    stringBuffer.append(root.data).append(" ");
                }
                q--;
            }
            stringBuffer.append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    private static Node leastCommonAncestor(Node root, int u, int v) {
        if (root == null) {
            return root;
        } else if (root.data == u || root.data == v) {
            return root;
        } else if ((root.data < u && root.data > v) || root.data > u && root.data < v) {
            return root;
        } else if (root.data < u && root.data < v) {
            return leastCommonAncestor(root.right, u, v);
        } else {
            return leastCommonAncestor(root.left, u, v);
        }
    }
}
