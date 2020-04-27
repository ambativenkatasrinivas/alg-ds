package com.srinivas.smartinterview.week3.day1;

import com.srinivas.common.Util;

// Given an array of size n and given k check any pair of array sum is k
public class PairSumEqK2 {
    public static void main(String[] args) {
        int arr[] = {3, -7, 8, -5, 20, 15, 12, 30};
        int k = 23;
        sortArray(arr);
        System.out.println();
        pairSumK(arr, k);
//        doWork(arr, k);
    }

    public static void pairSumK(int arr[], int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int sum = arr[low] + arr[high];
            if (sum < k) {
                low++;
            } else if (sum > k) {
                high--;
            } else {
                System.out.println(arr[low] + " " + arr[high]);
                low++;
                high--;
            }
        }
    }

    public static void doWork(int arr[], int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }

    public static void sortArray(int arr[]) {
        divide(arr, 0, arr.length - 1);
        Util.print(arr);
    }

    public static void divide(int arr[], int low, int high) {

        if (low == high) {
            return;
        }
        int mid = (high + low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1];
        int x = low, y = mid + 1;
        int index = 0;
        while (x <= mid && y <= high) {
            if (arr[x] <= arr[y]) {
                temp[index++] = arr[x++];
            } else {
                temp[index++] = arr[y++];
            }
        }

        while (x <= mid) {
            temp[index++] = arr[x++];
        }

        while (y <= high) {
            temp[index++] = arr[y++];
        }
        x = low;
        for (int i = 0; i < temp.length; i++) {
            arr[x++] = temp[i];
        }

    }
}
