package com.srinivas.revision1;

public class AllMostSortedArray {
    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 4, 70, 60, 50, 11, 12, 13, 100, 90, 80};
        int k = 4;
        MinHeap minHeap = new MinHeap(100);
        for (int i = 0; i <= k + 1; i++) {
            minHeap.insert(arr[i]);
        }
        for (int i = k + 2; i < arr.length; i++) {
            System.out.println(minHeap.getMin());
            minHeap.delete();
            minHeap.insert(arr[i]);
        }
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.getMin());
            minHeap.delete();
        }
    }
}
