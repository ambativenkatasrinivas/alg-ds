package com.srinivas.practice.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinHeap {
    private int lastIndex;
    private int[] heap;

    public MinHeap() {
        lastIndex = 0;
        heap = new int[100];
    }

    public void insert(int data) {
        heap[++lastIndex] = data;
        int cur = lastIndex;
        while (cur > 1 && heap[cur] < heap[cur / 2]) {
            swap(cur, cur / 2);
            cur = cur / 2;
        }
    }

    public int deleteMin(int i) {
        int deletedValue = heap[1];
        if (lastIndex > i) {
            if (lastIndex == 1) {
                heap[lastIndex--] = 0;
            } else {
                heap[1] = heap[lastIndex--];
                heapify(1);
            }
        }
        return deletedValue;
    }

    public int size() {
        return lastIndex;
    }

    private void heapify(int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int smallest = i;
        if (left <= lastIndex && heap[smallest] > heap[left]) {
            smallest = left;
        }
        if (right <= lastIndex && heap[smallest] > heap[right]) {
            smallest = right;
        }
        if (i != smallest) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    public int getMin() {
        if (lastIndex > 0) {
            return heap[1];
        }
        return -1;
    }

    private void swap(int s, int t) {
        int temp = heap[s];
        heap[s] = heap[t];
        heap[t] = temp;
    }

    public static void main(String[] args) throws IOException {
        MinHeap minHeap = new MinHeap();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String[] input = bufferedReader.readLine().split(" ");
            if (input[0].equals("insert")) {
                minHeap.insert(Integer.parseInt(input[1]));
            }
            if (input[0].equals("delMin")) {
                minHeap.deleteMin(1);
            }
            if (input[0].equals("getMin")) {
                stringBuffer.append(minHeap.getMin()).append("\n");
            }
            t--;
        }
        System.out.println(stringBuffer);
    }
}
