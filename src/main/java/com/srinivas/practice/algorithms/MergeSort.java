package com.srinivas.practice.algorithms;

public class MergeSort {

    private static void divide(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid+1;
        int idx = 0;
        int[] temp = new int[high - low + 1];
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[idx] = arr[i++];
            } else {
                temp[idx] = arr[j++];
            }
            idx++;
        }
        while (i <= mid) {
            temp[idx++] = arr[i++];
        }

        while (j <= high) {
            temp[idx++] = arr[j++];
        }
        i = low;
        for (int k=0;k<temp.length;k++){
            arr[i++] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        divide(arr, 0, arr.length - 1);
        Utils.print(arr);
    }
}
