package com.srinivas.sorting;

import com.srinivas.practice.algorithms.Utils;

public class InsertionSort {

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    Utils.swap(arr, j-1, j );
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        insertionSort(arr);
        Utils.print(arr);
    }
}
