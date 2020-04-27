package com.srinivas.revision1;

import com.srinivas.common.Util;

public class QuickSort {

    public static void main(String[] args) {
//        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int arr[] = {60, 15, 20, 5, 10, 35, 50, 45};

        arr = quickSort(arr, 0, arr.length - 1);
        Util.print(arr);
    }

    public static int[] quickSort(int arr[], int low, int high) {
        int i = low;
        int j = high;
        int pivot = (i + j) / 2;
        while (i < j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }
            while (arr[j] > arr[pivot]) {
                j--;
            }

            if (i <= j) {
                BubbleSort.swap(arr, i, j);
                i++;
                j--;
            }

                quickSort(arr, low, j);
                quickSort(arr, i, high);
        }
        return arr;
    }

}
