package com.srinivas.hackerrank.smartinterview.page8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VerticalOrderOfTree_S1 {

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

    public static void main(String[] args) {
        int arr[] = {4, 5, 15, 0, 1, 7, 17};

        Node root = createTree(arr);
        System.out.println(root);
        Map<Integer, List<Integer>> verticalOrder = new HashMap<>();
        verticalOrder = verticalOrderOfTree(root, 0, verticalOrder);
        for (Integer key : verticalOrder.keySet()) {
            List<Integer> list = verticalOrder.get(key);
            for (Integer data : list) {
                System.out.print(data + " ");
            }
            System.out.println();
        }

    }

    private static Map<Integer, List<Integer>> verticalOrderOfTree(Node root, int key, Map<Integer, List<Integer>> verticalOrder) {

        if (root == null) {
            return verticalOrder;
        }

        List<Integer> list = verticalOrder.get(key);
        if (list == null) {
            list = new ArrayList<>();
            list.add(root.data);
            verticalOrder.put(key, list);
        } else {
            list.add(root.data);
            verticalOrder.put(key, list);
        }

        if (root.left != null) {
            key = key - 1;
            verticalOrder = verticalOrderOfTree(root.left, key, verticalOrder);
        }  if (root.right != null) {
            key = key + 1;
            verticalOrder = verticalOrderOfTree(root.right, key, verticalOrder);
        }

        return verticalOrder;
    }

}
