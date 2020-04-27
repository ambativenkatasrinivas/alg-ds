package com.srinivas.practice2.backtracking;

public class Interleaving {

    private static void interleaving(char[] arr, char[] str1, char[] str2, int i, int j, int idx) {
        if (arr.length == idx) {
            for (int x = 0; x < arr.length; x++) {
                System.out.print(" " + arr[x]);
            }
            System.out.println();
        }
        if (idx < arr.length) {
            if (i < str1.length) {
                arr[idx] = str1[i];
                interleaving(arr, str1, str2, i + 1, j, idx + 1);
            }
            if (j < str2.length) {
                arr[idx] = str2[j];
                interleaving(arr, str1, str2, i, j + 1, idx + 1);
            }
        }
    }

    public static void main(String[] args) {
        char[] arr = new char[5];
        char[] str1 = new char[3];
        str1[0] = '1';
        str1[1] = '2';
        str1[2] = '3';
        char[] str2 = new char[2];
        str2[0] = '4';
        str2[1] = '5';
        interleaving(arr, str1, str2, 0, 0, 0);
    }
}
