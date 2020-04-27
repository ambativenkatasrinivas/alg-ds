package com.srinivas.practice.algorithms;

import java.util.Arrays;

public class Utils {

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
