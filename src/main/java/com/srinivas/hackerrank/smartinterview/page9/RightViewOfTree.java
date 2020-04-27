package com.srinivas.hackerrank.smartinterview.page9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightViewOfTree {

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

        Node peek() {
            return arr[rear+1];
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
//        int arr[] = {4, 5, 15, 0, 1, 7, 17};
//        Node root = createTree(arr);
//        System.out.println(leftViewOfTree(root));
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
            stringBuilder.append(rightViewOfTree(root));
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static StringBuffer rightViewOfTree(Node root) {
        StringBuffer stringBuffer = new StringBuffer();
        Queue queue = new Queue();
        queue.enqueue(root);
        queue.enqueue(null);
//        Node prev = null;
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp == null) {
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                }
//                System.out.println();
            } else {
                if (queue.peek() == null) {
                    stringBuffer.append(temp.data).append(" ");
                }
                if (temp.left != null) {
                    queue.enqueue(temp.left);
                }
                if (temp.right != null) {
                    queue.enqueue(temp.right);
                }
//                System.out.print(temp.data + " ");
            }
//            prev = temp;
        }

        return stringBuffer;
    }
}
