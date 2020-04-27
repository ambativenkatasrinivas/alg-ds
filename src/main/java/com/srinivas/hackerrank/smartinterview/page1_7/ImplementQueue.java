package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementQueue {
    static class Queue {
        int arr[] = new int[10000];
        int front = -1, rear = -1;

        void enqueue(int x) {
            arr[++front] = x;
        }

        int dequeue() {
            return arr[++rear];
        }

        boolean isEmpty() {
            return front == rear;
        }
    }

    public static void main(String[] args) throws IOException {
        Queue queue = new Queue();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String input = bufferedReader.readLine();
            String[] elements = input.split(" ");
            if (elements[0].equals("Enqueue")) {
                int ele = Integer.parseInt(elements[1]);
                queue.enqueue(ele);

            } else {
                if (queue.isEmpty()) {
                    stringBuffer.append("Empty").append("\n");
                } else {
                    stringBuffer.append(queue.dequeue()).append("\n");
                }
            }
            t--;
        }
        System.out.println(stringBuffer);
    }
}
