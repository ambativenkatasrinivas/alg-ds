package com.srinivas.algorithms;

public class BuildHeap {

    private static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = (i * 2) + 1;
        int right = (i * 2) + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void buildHeap(int arr[], int n) {
        // Index of last non-leaf node
        int startIdx = (n / 2) - 1;
        // Perform reverse level order traversal
        // from last non-leaf node and heapify
        // each node
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void printHeap(int arr[], int n)
    {
        System.out.println("Array representation of Heap is:");

        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 35,33,42,10,14,19,27,44,26,31 };

        int n = arr.length;

        buildHeap(arr, n);

        printHeap(arr, n);
    }
}
