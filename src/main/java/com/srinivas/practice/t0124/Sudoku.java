package com.srinivas.practice.t0124;

import com.srinivas.practice.algorithms.Utils;

public class Sudoku {
    public static void main(String[] args) {
        allCombinaions(5, new boolean[6], new int[6], 1);
    }

    private static void allCombinaions(int n, boolean[] isPresent, int[] arr, int idx) {
        if (idx-1 == n) {
            Utils.print(arr);
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (!isPresent[i]) {
                arr[idx] = i;
                isPresent[i] = true;
                allCombinaions(n, isPresent, arr, idx + 1);
                isPresent[i] = false;
            }
        }
    }
}
