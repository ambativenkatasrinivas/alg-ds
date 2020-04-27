package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Not working
 */
public class ZigZagLevelOrderOfTree {
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

            stringBuilder.append(zigZagLevelOrderOfTree(root));
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static void swap(Node root) {
        if (root == null)
             return;
        Node swap = root.left;
        root.left = root.right;
        root.right = swap;
        swap (root.left);
        swap (root.right);
    }

    private static StringBuilder zigZagLevelOrderOfTree(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue queue = new Queue();
        queue.enqueue(root);
        queue.enqueue(null);
        int count = 2;
//        swap(root);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp != null) {
                if (count % 2 == 0) {
                    if (temp.left != null) {
                        queue.enqueue(temp.left);
                    }
                    if (temp.right != null) {
                        queue.enqueue(temp.right);
                    }
                } else {
                    if (temp.right != null) {
                        queue.enqueue(temp.right);
                    }
                    if (temp.left != null) {
                        queue.enqueue(temp.left);
                    }
                }
                stringBuilder.append(temp.data).append(" ");
            } else {
                count++;
//                stringBuilder.append("\n");
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                }
            }
        }
        return stringBuilder;
    }
}
