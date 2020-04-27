package com.srinivas.revision1;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int k = 5;
        MinHeap minHeap= new MinHeap(100);
        for (int i = 0; i < k; i++) {
            minHeap.insert(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (minHeap.getMin() < arr[i]) {
                minHeap.delete();
                minHeap.insert(arr[i]);
            }
        }
        System.out.println(minHeap.getMin());
    }
}
