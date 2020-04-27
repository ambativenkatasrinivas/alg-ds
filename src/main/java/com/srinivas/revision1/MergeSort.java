package com.srinivas.revision1;

import com.srinivas.common.Util;

public class MergeSort {
    static int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};

    public static void main(String[] args) {
        divide(0, arr.length - 1);
        Util.print(arr);
    }

    public static void divide(int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        divide(low, mid);
        divide(mid + 1, high);
        merge(low, mid, high);
    }

    public static void merge(int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int k = 0;
        int i = low;
        int j = mid + 1;
        while (i <= mid && j <= high) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }
        k = 0;
        for (int x = low; x <= high; x++) {
            arr[x] = temp[k];
            k++;
        }
    }

}
