package com.srinivas.smartinterview.week6.day1;

import com.srinivas.common.Util;

/**
 * 3 -1 21 18 7 19 -5 -7 11 13
 * k = 4 (Rotate array by k positions)
 * -5 -7 11 13 3 -1 21 18 7 19
 *
 *  K * N
 */
public class RotateArrayByKpositions {
    public static void main(String[] args) {
        int arr[] = {3, -1, 21, 18, 7, 19, -5, -7, 11, 13};
        int k = 4;
        for (int i = 1; i <= k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 2; j >= 0 ; j--) {
                arr[j + 1] = arr[j];
            }
            arr[0] = temp;
        }
        Util.print(arr);
    }
}
