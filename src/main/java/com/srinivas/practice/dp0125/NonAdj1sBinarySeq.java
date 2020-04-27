package com.srinivas.practice.dp0125;

import com.srinivas.practice.algorithms.Utils;

public class NonAdj1sBinarySeq {
    public static void main(String[] args) {
        int[] arr = new int[6];
        binarySeq(arr, 0, 6);
    }

    private static void binarySeq(int[] arr, int idx, int n) {
        if (n == idx) {
            Utils.print(arr);
            System.out.println();
        }
        if (idx < n) {
            arr[idx] = 0;
            binarySeq(arr, idx + 1, n);
            arr[idx] = 1;
            binarySeq(arr, idx + 1, n);
        }
    }
}
