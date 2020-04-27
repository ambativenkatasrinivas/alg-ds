package com.srinivas.revision1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LevalOrderAndVerticalOrder {

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    private static void levelOrder(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node temp = queue.pop();
            if (temp != null) {
                System.out.print(temp.data + " ");
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            } else {
                if (!queue.isEmpty()) {
                    queue.add(null);
                    System.out.println();
                }
            }
        }
    }

    private static Map<Integer, List<Integer>> verticalOrder(Node root, Map<Integer, List<Integer>> map, int idx) {
        if (root == null) {
            return map;
        }
        List<Integer> list = map.get(idx);
        if (map.get(idx) == null) {
            list = new ArrayList<>();
        }
        list.add(root.data);
        map.put(idx, list);
        verticalOrder(root.left, map, idx - 1);
        verticalOrder(root.right, map, idx + 1);
        return map;
    }

    public static void main(String[] args) {
        Node root = new Node(3);

        Node left = new Node(-1);
        Node right = new Node(15);
        root.left = left;
        root.right = right;

        left.left = new Node(8);
        left.right = new Node(17);

        left.left.right = new Node(6);

        right.left = new Node(3);
        right.right = new Node(9);

        right.right.left = new Node(19);
        right.right.left.right = new Node(27);

//        levelOrder(root);

        Map<Integer, List<Integer>> verticalOrder = verticalOrder(root, new HashMap<>(), 0);

        for (int key: verticalOrder.keySet()) {
            List<Integer> list = verticalOrder.get(key);
            for (int data : list) {
                System.out.print(data+" ");
            }
            System.out.println();
        }
    }
}
