package com.srinivas.smartinterview.week6.day1;

import com.srinivas.common.Util;

/* Generate a array for given queries
N = 15
Q i j x
  1 7 8
  6 8 -1
  0 4 3

  complexity Q * N, N
**/

import com.srinivas.common.Util;

public class Problem1_s2 {
    public static void main(String[] args) {
        int arr[] = new int[15];

        arr[1] += 8;
        arr[7 + 1] += -8;
        arr[6] += -1;
        arr[8+1] += 1;
        arr[0] += 3;
        arr[4+1] += -3;
        generateArray(arr);
        Util.print(arr);
    }

    public static int[] generateArray(int arr[]) {

        for(int k = 1;k< arr.length; k++) {
            arr[k] += arr[k-1];
        }
        return arr;
    }
}