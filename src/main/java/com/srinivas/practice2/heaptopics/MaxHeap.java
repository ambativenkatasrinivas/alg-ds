package com.srinivas.practice2.heaptopics;

import com.srinivas.practice.sorting0208.BubbleSort;

public class MaxHeap {

    int[] heap;
    int lastIdx;
    int size;

    public MaxHeap(int size) {
        heap = new int[size];
        lastIdx = 0;
        this.size = size;
    }

    public boolean isEmpty() {
        return lastIdx == 0;
    }

    public void insert(int data) {
        heap[++lastIdx] = data;
        int cur = lastIdx;
        while (cur  > 1 && heap[cur] > heap[cur / 2]) {
            BubbleSort.swap(heap, cur, cur / 2);
            cur = cur / 2;
        }
    }

    public void delete() {
        if (lastIdx == 1) {
            heap[1] = 0;
        } else {
            heap[1] = heap[lastIdx];
            heapify(1);
        }
        lastIdx--;
    }

    public void heapify(int idx) {
        int largest = idx;
        int left = 2 * idx;
        int right = 2 * idx + 1;
        if (left <= lastIdx && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right <= lastIdx && heap[right] > heap[largest]) {
            largest = right;
        }
        if (largest != idx) {
            BubbleSort.swap(heap, idx, largest);
            heapify(largest);
        }
    }

    public int getMax() {
        return heap[1];
    }

    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(1000);
        maxHeap.insert(10);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(20);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(30);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(40);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(50);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(60);
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.insert(70);
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());

    }

}
