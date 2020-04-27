package com.srinivas.revision1;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int key = 40;
        QuickSort quickSort = new QuickSort();
        arr = QuickSort.quickSort(arr, 0, arr.length - 1);
        if (search(arr, key)) {
            System.out.println("KEY FOUND");
        } else {
            System.out.println("KEY NOT FOUND");
        }
    }

    public static boolean search(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return true;
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return false;
    }

}
