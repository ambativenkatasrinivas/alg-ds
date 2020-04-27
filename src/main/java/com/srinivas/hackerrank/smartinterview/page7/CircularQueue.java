package com.srinivas.hackerrank.smartinterview.page7;

public class CircularQueue {

    private int queue[];
    private int front, rear;

    public CircularQueue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public boolean isFull() {
        return front == rear + 1 || (front == 0 && rear == queue.length - 1);
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void enqueue(int x) {
        if (isFull()) {
            System.out.println(" QUEUE FULL ");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % queue.length;
            queue[rear] = x;
        }
    }

    public int dequeue() {
        int temp = -1;
        if (isEmpty()) {
            System.out.println(" QUEUE EMPTY ");
            return temp;
        } else {
            temp = queue[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % queue.length;
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.enqueue(40);
        circularQueue.enqueue(50);
        circularQueue.enqueue(60);
        for (int i = 0; i < 5; i++) {
            System.out.println(" " + circularQueue.dequeue());
        }
        System.out.println("Is empty " + circularQueue.isEmpty());

    }
}
