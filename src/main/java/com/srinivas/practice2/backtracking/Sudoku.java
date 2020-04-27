package com.srinivas.practice2.backtracking;

public class Sudoku {
    private static void sudoku(int arr[], boolean[] isPresent, int idx, int n) {
        if (n == idx) {
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (!isPresent[i]) {
                isPresent[i] = true;
                arr[idx] = i;
                sudoku(arr, isPresent, idx + 1, n);
                isPresent[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        int n = 9;
        sudoku(new int[n+1], new boolean[n+1],0,n);
    }
}
