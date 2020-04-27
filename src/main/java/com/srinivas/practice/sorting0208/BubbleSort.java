package com.srinivas.practice.sorting0208;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length - 1; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    swap(arr, j, j+1);
//                }
//            }
//        }
//        print(arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
