package com.srinivas.hackerrank.smartinterview.page7;

import java.util.Arrays;

public class KillingDragons {
    private static class CircularQueue {
        private Dungeons queue[];
        private int front, rear;
        private int size;

        public CircularQueue(int size) {
            queue = new Dungeons[size];
            this.size = size;
            front = -1;
            rear = -1;
        }

        public void enqueue(Dungeons x) {
            front = (front + 1) % queue.length;
            queue[front] = x;
        }

        public Dungeons dequeue() {
            rear = (rear + 1) % queue.length;
            return queue[rear];
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public Dungeons[] duplicate() {
            return Arrays.copyOf(queue, size);
        }
    }

    private static class Dungeons {
        int ce;
        int ge;

        public Dungeons(int ce, int ge) {
            this.ce = ce;
            this.ge = ge;
        }

    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(4);
        Dungeons dungeons1 = new Dungeons(5, 20);
        Dungeons dungeons2 = new Dungeons(10, 2);
        Dungeons dungeons3 = new Dungeons(12, 1);
        Dungeons dungeons4 = new Dungeons(4, 15);
        circularQueue.enqueue(dungeons1);
        circularQueue.enqueue(dungeons2);
        circularQueue.enqueue(dungeons3);
        circularQueue.enqueue(dungeons4);
        killingDragons(circularQueue);
    }

    private static void killingDragons(CircularQueue circularQueue) {
        Dungeons[] dungeons = circularQueue.duplicate();
        for (int i = 0; i < 4; i++) {
            System.out.print(" " + dungeons[i].ge);
            System.out.print(" " + dungeons[i].ce);
            System.out.println();
        }
    }
}

