package com.srinivas.revision1;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            BubbleSort.swap(arr, i, min);
        }
        BubbleSort.printArray(arr);
    }
}
