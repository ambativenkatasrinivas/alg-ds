package com.srinivas.practice.backtracking;

public class GenerateSquare3 {

    private static void generateSquare(int n, int arr[], int idx) {

        if (idx == n) {
            for (int x = 0; x < n; x++) {
                System.out.print(" " + arr[x]);
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            if (idx < n) {
                arr[idx] = i;
                generateSquare(n, arr, idx + 1);
            }
        }
    }

    //TODO: Generate without using for loop
    private static void generateSquare1(int n, int arr[], int idx) {
        if (idx == n) {
            for (int x = 0; x < n; x++) {
                System.out.print(" " + arr[x]);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (idx < n) {
                arr[idx] = i;
                generateSquare1(n, arr, idx + 1);
            }
        }
    }

    public static void main(String[] args) {
        generateSquare1(3, new int[3], 0);
    }
}
