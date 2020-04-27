package com.srinivas.practice.sorting0208;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
//        int arr[] = { 12, 11, 13, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            int min = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > min) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = min;
        }
        BubbleSort.print(arr);
    }
}
