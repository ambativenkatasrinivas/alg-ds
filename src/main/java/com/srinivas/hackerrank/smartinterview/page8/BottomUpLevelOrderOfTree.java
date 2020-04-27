package com.srinivas.hackerrank.smartinterview.page8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BottomUpLevelOrderOfTree {
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

    public static class Stack {
        private int top = -1;
        private int arr[] = new int[10000];

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
            if (top == -1) {
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
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
        System.out.println(stringBuilder.subSequence(1,stringBuilder.length()-1));
    }

    private static StringBuilder levelOrderOfTree(Node root) {
        StringBuilder stringBuilder = new StringBuilder();
        Queue queue = new Queue();
        Stack stack = new Stack();
        queue.enqueue(root);
        queue.enqueue(null);
        while (!queue.isEmpty()) {
            Node temp = queue.dequeue();
            if (temp != null) {

                if (temp.right != null) {
                    queue.enqueue(temp.right);
                }
                if (temp.left != null) {
                    queue.enqueue(temp.left);
                }
                stack.push(temp.data);
            } else {
                stack.push(100000);
                if (!queue.isEmpty()) {
                    queue.enqueue(null);
                }
            }
        }

        while (!stack.isEmpty()) {
            if (stack.peek() == 100000) {
                stringBuilder.append("\n");
                stack.pop();
            } else {
                stringBuilder.append(stack.pop()).append(" ");
            }
        }
        return stringBuilder;
    }
}
