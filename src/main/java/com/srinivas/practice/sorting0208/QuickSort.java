package com.srinivas.practice.sorting0208;

public class QuickSort {
    static int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};

    public static void main(String[] args) {
        int low = 0;
        int high = arr.length - 1;
        quickSort(low, high);
        BubbleSort.print(arr);
    }

    private static void quickSort(int low, int high) {
        int i = low;
        int j = high;
        while (i < j) {
            int pivot = arr[j - i / 2];
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                BubbleSort.swap(arr, i, j);
                i++;
                j--;

            }
            quickSort(0, j );
            quickSort(i , high);
        }
    }
}
