package com.srinivas.practice.revision1.trees;

public class ZigZagLevelOrderOfTree {
    private static class Node {
        int data, depth;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
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

    private static Node create(int[] arr) {
        Node root = null;
        root = insert(root, arr[0]);
        for (int i = 1; i < arr.length; i++) {
            insert(root, arr[i]);
        }
        return root;
    }

    private static class Queue {

        int front = -1, rear = -1;
        Node arr[] = new Node[100];

        public void enqueue(Node data) {
            arr[++front] = data;
        }

        public Node dequeue() {
            return arr[++rear];
        }

        public boolean isEmpty() {
            return front == rear;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 3, 1, 0, 15, 7, 6, 17, 18};
        Node root = create(arr);
        zigZagLevelOrder(root);

    }

    private static void zigZagLevelOrder(Node root) {
        Queue queueEven = new Queue();
        Queue queueOdd = new Queue();

        queueEven.enqueue(root);
        queueOdd.enqueue(root);
        queueEven.enqueue(null);
        queueOdd.enqueue(null);
        boolean isEven = true;
        while (!queueEven.isEmpty()) {
            Node evenTemp = queueEven.dequeue();
            Node oddTemp = queueOdd.dequeue();

            if (evenTemp == null) {
                if (isEven) {
                    isEven = false;
                } else {
                    isEven = true;
                }
                System.out.println();
                if (!queueEven.isEmpty()) {
                    queueEven.enqueue(null);
                    queueOdd.enqueue(null);
                }
            } else {

                if (evenTemp.left != null) {
                    queueEven.enqueue(evenTemp.left);
                }
                if (evenTemp.right != null) {
                    queueEven.enqueue(evenTemp.right);
                }

                if (oddTemp.right != null) {
                    queueOdd.enqueue(oddTemp.right);
                }
                if (oddTemp.left != null) {
                    queueOdd.enqueue(oddTemp.left);
                }

                if (isEven) {
                    System.out.print(evenTemp.data + " ");
                } else {
                    System.out.print(oddTemp.data + " ");
                }
            }

        }

    }
}
