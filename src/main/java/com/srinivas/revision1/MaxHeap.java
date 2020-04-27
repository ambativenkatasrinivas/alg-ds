package com.srinivas.revision1;

public class MaxHeap {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(100);
        //        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        maxHeap.insert(15);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(20);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(5);
        System.out.println(maxHeap.getMax());
        maxHeap.insert(10);
        maxHeap.insert(35);
        maxHeap.insert(50);
        maxHeap.insert(45);
        maxHeap.insert(60);
        System.out.println(maxHeap.getMax());
        System.out.println("Delete");
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
        maxHeap.delete();
        System.out.println(maxHeap.getMax());
    }

    int lastIndex;
    int[] heap;
    int size;

    public MaxHeap(int size) {
        lastIndex = 0;
        heap = new int[size];
        this.size = size;
    }

    public void insert(int data) {
        heap[++lastIndex] = data;
        int cur = lastIndex;
        while (cur > 1 && heap[cur] > heap[cur / 2]) {
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
        int largest = i;
        int left = i * 2;
        int right = (i * 2) + 1;
        if (left <= lastIndex && heap[left] > heap[largest]) {
            largest = left;
        }
        if (right <= lastIndex && heap[right] > heap[largest]) {
            largest = right;
        }
        if (i != largest) {
            BubbleSort.swap(heap, i, largest);
            hepify(largest);
        }
    }

    public int getMax() {
        return heap[1];
    }

    public int size() {
        return lastIndex;
    }
}
