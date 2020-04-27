package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VerticalOrderOfTree {
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
            inorder(root);
//            stringBuilder.append();
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static void inorder(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.println();
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);

    }

    private static StringBuilder levelOrderOfTree(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue queue = new Queue();
        queue.enqueue(root);
        queue.enqueue(null);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp != null) {
                if (temp.left != null) {
                    queue.enqueue(temp.left);
                }
                if (temp.right != null) {
                    queue.enqueue(temp.right);
                }
                stringBuilder.append(temp.data).append(" ");
            } else {
                stringBuilder.append("\n");
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                }
            }
        }
        return stringBuilder;
    }
}
