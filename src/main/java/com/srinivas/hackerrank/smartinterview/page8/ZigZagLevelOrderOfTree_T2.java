package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZagLevelOrderOfTree_T2 {
    private static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
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
            stringBuilder.append(levelOrderOfTree(root));
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static StringBuilder levelOrderOfTree(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue evenQueue = new Queue();
        Queue oddQueue = new Queue();
        int count = 0;
        evenQueue.enqueue(root);
        oddQueue.enqueue(root);
        evenQueue.enqueue(null);
        oddQueue.enqueue(null);
        while (!evenQueue.isEmpty() && !oddQueue.isEmpty()) {
            Node oddTemp = oddQueue.dequeue();
            Node evenTemp = evenQueue.dequeue();
            if (oddTemp != null && evenTemp != null) {
                if (oddTemp.left != null) {
                    oddQueue.enqueue(oddTemp.left);
                }
                if (oddTemp.right != null) {
                    oddQueue.enqueue(oddTemp.right);
                }

                if (evenTemp.right != null) {
                    evenQueue.enqueue(evenTemp.right);
                }
                if (evenTemp.left != null) {
                    evenQueue.enqueue(evenTemp.left);
                }

                if (count % 2 == 0) {
                    stringBuilder.append(evenTemp.data).append(" ");
                } else {
                    stringBuilder.append(oddTemp.data).append(" ");
                }
            } else {
                count++;
                if (!evenQueue.isEmpty() && !oddQueue.isEmpty()) {
                    evenQueue.enqueue(null);
                    oddQueue.enqueue(null);
                }
            }
        }
        return stringBuilder;
    }
}
