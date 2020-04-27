package com.srinivas.hackerrank.algorithms;

import java.util.Arrays;

public class SubsetsOfAnArray {
    public static void main(String[] args) {
        int n = 4;
        boolean[] check = new boolean[n];
        int str[] = {3,8,15,23};
        int arr[] = new int[n];
        generateSquare(n, check, str, arr, 0);
    }

    static void generateSquare(int n, boolean check[], int str[], int arr[], int index) {
        if (true) {
            for (int i = 0; i < index; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            if (!check[i]) {
                check[i] = true;
                arr[index] = str[i];
                generateSquare(n, check, str,arr, index + 1);
                check[index] = false;
            }
        }
    }
}
