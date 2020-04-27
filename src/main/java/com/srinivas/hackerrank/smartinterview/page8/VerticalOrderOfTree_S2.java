package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VerticalOrderOfTree_S2 {

    private static class Node {
        Node left, right;
        int data;

        private Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static Node createNode(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        if (root.data > data) {
            root.left = createNode(root.left, data);
        } else {
            root.right = createNode(root.right, data);
        }
        return root;
    }

    private static Node createTree(int arr[]) {
        Node root = null;
        for (int i : arr) {
            root = createNode(root, i);
        }
        return root;
    }

    public static void main(String[] args) throws IOException {
        int arr[] = {4, 5, 15, 0, 1, 7, 17};

        Node root = createTree(arr);
        System.out.println(root);
        Map<Integer, List<Integer>> verticalOrder = new TreeMap<>();
        verticalOrder = verticalOrderOfTree(root, 0, verticalOrder);
        for (Integer key : verticalOrder.keySet()) {
            List<Integer> list = verticalOrder.get(key);
            Collections.sort(list);
            for (Integer data : list) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

//        StringBuffer stringBuffer = new StringBuffer();
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(bufferedReader.readLine());
//        while (t > 0) {
//            int n = Integer.parseInt(bufferedReader.readLine());
//            String arr[] = bufferedReader.readLine().split(" ");
//            int[] intArr = new int[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                intArr[i] = Integer.parseInt(arr[i]);
//            }
//            Node root = createTree(intArr);
//            Map<Integer, List<Integer>> verticalOrder = new TreeMap<>();
//            verticalOrder = verticalOrderOfTree(root, 0, verticalOrder);
//            for (Integer key : verticalOrder.keySet()) {
//                List<Integer> list = verticalOrder.get(key);
//                Collections.sort(list);
//                for (Integer data : list) {
//                    stringBuffer.append(data).append(" ");
//                }
//                stringBuffer.append("\n");
//            }
//            stringBuffer.append("\n");
//            t--;
//        }
//        System.out.println(stringBuffer);
    }

    private static Map<Integer, List<Integer>> verticalOrderOfTree(Node root, int key, Map<Integer, List<Integer>> verticalOrder) {
        if (root == null) {
            return verticalOrder;
        }
        List<Integer> list = verticalOrder.get(key);
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(root.data);
        verticalOrder.put(key, list);
//        if (root.left != null) {
            verticalOrder = verticalOrderOfTree(root.left, key - 1, verticalOrder);
//        }
//        if (root.right != null) {
            verticalOrder = verticalOrderOfTree(root.right, key + 1, verticalOrder);
//        }
        return verticalOrder;
    }
}
