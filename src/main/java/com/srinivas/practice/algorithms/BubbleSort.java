package com.srinivas.practice.algorithms;

import com.srinivas.common.Util;

public class BubbleSort {

    private static void bubbleSort(int arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-1;j++) {
                if (arr[j] > arr[j+1]) {
                    Utils.swap(arr, j, j+1);
                }
            }
        }
    }

    private static void bubbleSortOptimized(int arr[]) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=0;j<arr.length-i-1;j++) {
                if (arr[j] > arr[j+1]) {
                    Utils.swap(arr, j, j+1);
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45,60};
        bubbleSortOptimized(arr);
        Utils.print(arr);
    }
}
