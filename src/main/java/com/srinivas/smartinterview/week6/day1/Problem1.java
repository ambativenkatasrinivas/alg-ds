package com.srinivas.smartinterview.week6.day1;
/* Generate a array for given queries
N = 15
Q i j x
  1 7 8
  6 8 -1
  0 4 3

  complexity Q * N, N
**/

import com.srinivas.common.Util;

public class Problem1 {
    public static void main(String[] args) {
        int arr[] = new int[15];
        generateArray(arr, 1, 7, 8);
        generateArray(arr, 6, 8, -1);
        generateArray(arr, 0, 4, 3);
        Util.print(arr);
    }

    public static int[] generateArray(int arr[], int i, int j, int x) {
        for(int k = i;k<=j;k++) {
            arr[k] += x;
        }
        return arr;
    }
}
