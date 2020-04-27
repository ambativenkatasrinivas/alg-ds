package com.srinivas.revision1;

public class CeilAndFloor {
    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int key = 40;
        QuickSort quickSort = new QuickSort();
        arr = QuickSort.quickSort(arr, 0, arr.length - 1);
        System.out.println(ceil(arr, key));
        System.out.println(floor(arr, key));
        key = 14;
        System.out.println(ceil(arr, key));
        System.out.println(floor(arr, key));
    }

    public static int ceil(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        int ceil = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                j = mid - 1;
                ceil = arr[mid];
            } else {
                i = mid + 1;
            }
        }
        return ceil;
    }

    public static int floor(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        int floor = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return arr[mid];
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
                floor = arr[mid];
            }
        }
        return floor;
    }
}
