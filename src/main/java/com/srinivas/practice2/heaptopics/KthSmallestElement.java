package com.srinivas.practice2.heaptopics;

public class KthSmallestElement {

    public static void main(String[] args) {
        int arr[] = {12, 3, 5, 7, 4, 19, 26};
        int k = 6;
        MaxHeap maxHeap = new MaxHeap(100);
        for (int i = 0; i < k; i++) {
            maxHeap.insert(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (maxHeap.getMax() > arr[i]) {
                maxHeap.delete();
                maxHeap.insert(arr[i]);
            }
        }
        System.out.println(" k th (" + k + ") smallest element " + maxHeap.getMax());
    }

}
