package com.srinivas.revision1;

public class MinHeap {

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(100);
        //        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        minHeap.insert(15);
        System.out.println(minHeap.getMin());
        minHeap.insert(20);
        System.out.println(minHeap.getMin());
        minHeap.insert(5);
        System.out.println(minHeap.getMin());
        minHeap.insert(10);
        minHeap.insert(35);
        minHeap.insert(50);
        minHeap.insert(45);
        minHeap.insert(60);
        System.out.println(minHeap.getMin());
        System.out.println("Delete");
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
        minHeap.delete();
        System.out.println(minHeap.getMin());
    }

    int lastIndex;
    int[] heap;
    int size;

    public MinHeap(int size) {
        lastIndex = 0;
        heap = new int[size];
        this.size = size;
    }

    public void insert(int data) {
        heap[++lastIndex] = data;
        int cur = lastIndex;
        while (cur > 1 && heap[cur] < heap[cur / 2]) {
            BubbleSort.swap(heap, cur, cur / 2);
            cur = cur / 2;
        }
    }

    public void delete() {
        if (lastIndex == 1) {
            heap[lastIndex--] = 0;
        } else {
            heap[1] = heap[lastIndex--];
            hepify(1);
        }
    }

    private void hepify(int i) {
        int smallest = i;
        int left = i * 2;
        int right = (i * 2) + 1;
        if (left <= lastIndex && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= lastIndex && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (i != smallest) {
            BubbleSort.swap(heap, i, smallest);
            hepify(smallest);
        }
    }

    public boolean isEmpty() {
        return lastIndex == 0;
    }

    public int getMin() {
        return heap[1];
    }

    public int size() {
        return lastIndex;
    }
}
