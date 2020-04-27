package com.srinivas.smartinterview.week3.day1;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {12,11,13,5,6,7};
        divide(arr, 0, arr.length - 1);

        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void divide(int arr[], int low, int high) {
        int mid = (low + high) / 2;
        if (low == high) {
            return;
        }
        divide(arr, low, mid);
        divide(arr, mid+1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int x = 0;
        int i = low, j = mid+1;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[x++] = arr[i++];
            } else {
                temp[x++] = arr[j++];
            }
        }

        while (i<=mid) {
            temp[x++] = arr[i++];
        }

        while (j<=high) {
            temp[x++] = arr[j++];
        }
        i = low;
        for (int k=0;k<temp.length;k++){
            arr[i++] = temp[k];
        }
    }
}
