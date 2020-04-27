package com.srinivas.practice2.backtracking;

public class BinarySequence {
    private static void binarySequence(int arr[], boolean[] isPresent, int idx, int n) {
        if (n == idx) {
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        if (idx <= n) {
            arr[idx] = 0;
            binarySequence(arr, isPresent, idx + 1, n);
            arr[idx] = 1;
            binarySequence(arr, isPresent, idx + 1, n);
        }
    }

    public static void main(String[] args) {
        int n = 20;
        binarySequence(new int[n + 1], new boolean[n + 1], 0, n);
    }
}
