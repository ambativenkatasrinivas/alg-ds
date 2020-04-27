package com.srinivas.revision1;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int min = arr[i];

            // Invalid
//            while (j >= 0) {
//                if (arr[j] > min) {
//                    arr[j + 1] = arr[j];
//                    j--;
//                }
//            }

            while (j >= 0 && arr[j] > min) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = min;
        }
        BubbleSort.printArray(arr);
    }
}
