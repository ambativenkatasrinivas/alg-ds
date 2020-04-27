package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class IsCompleteBinaryTree {

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

    static class Queue {
        Node arr[] = new Node[10000];
        int front = -1, rear = -1;

        void enqueue(Node x) {
            arr[++front] = x;
        }

        Node dequeue() {
            return arr[++rear];
        }

        boolean isEmpty() {
            return front == rear;
        }
    }

    public static void main(String[] args) throws IOException {
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
            if (isCBT(root)) {
                stringBuilder.append("Yes");
            } else {
                stringBuilder.append("No");
            }

            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder.substring(0, stringBuilder.length() - 1));
    }

    static boolean isCBT(Node root) {
        if (root == null) {
            return true;
        }
        Queue queue = new Queue();
        queue.enqueue(root);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp == null) {
                while (!queue.isEmpty()) {
                    if (queue.dequeue() != null) {
                        return false;
                    }
                }
            } else {
                queue.enqueue(temp.left);
                queue.enqueue(temp.right);
            }
        }
        return true;
    }
}
