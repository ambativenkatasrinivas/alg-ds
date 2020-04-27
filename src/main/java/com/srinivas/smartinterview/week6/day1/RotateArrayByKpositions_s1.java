package com.srinivas.smartinterview.week6.day1;

import com.srinivas.common.Util;

public class RotateArrayByKpositions_s1 {
    public static void main(String[] args) {
        int arr[] = {3, -1, 21, 18, 7, 19, -5, -7, 11, 13};
        int k = 4;
        rotateArray(arr, 0, arr.length - 1);
        rotateArray(arr, 0, k - 1);
        rotateArray(arr, k, arr.length - 1);
        Util.print(arr);
    }

    private static void rotateArray(int[] arr, int i, int k) {
        while (i < k) {
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
            i++;
            k--;
        }
    }
}
