package com.srinivas.practice.sorting0208;

public class MergeSort {
    static int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};

    public static void main(String[] args) {
        divide(0, arr.length - 1);
        BubbleSort.print(arr);
    }

    private static void divide(int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = (high+low) / 2;
        divide(low, mid);
        divide(mid + 1, high);
        merget(low, mid, high);
    }

    private static void merget(int low, int mid, int high) {
        int[] temp = new int[high - low+1];
        int i = low;
        int j = mid + 1;
        int k = 0;
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
        int x = low;
        k = 0;
        while (x <= high) {
            arr[x++] = temp[k++];
        }
    }
}
