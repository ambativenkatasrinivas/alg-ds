package com.srinivas.practice.sorting0208;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;
                }
            }
            BubbleSort.swap(arr, i, minIdx);
        }
        BubbleSort.print(arr);
    }
}
