package com.srinivas.practice.algorithms;

import com.srinivas.common.Util;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        int i = low;
        int j = high;
        int pivot = (i + (j - i) / 2);

        while (i < j) {

            while (arr[pivot] > arr[i]) {
                i++;
            }

            while (arr[pivot] < arr[j]) {
                j--;
            }

            if (i <= j) {
                Utils.swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (i<high) {
            quickSort(arr,i, high);
        }
        if (low < j) {
            quickSort(arr, low ,j);
        }

    }

    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        quickSort(arr,0, arr.length-1);
        Utils.print(arr);
    }
}
