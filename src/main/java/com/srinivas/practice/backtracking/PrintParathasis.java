package com.srinivas.practice.backtracking;

public class PrintParathasis {
    static void print(int n, int i, char arr[], int oc, int cc) {

        if (i == n) {
            System.out.println();
            for (int idx = 0; idx < arr.length; idx++) {
                System.out.print(arr[idx] + " ");
            }
        }

        if (oc < n / 2) {
            arr[i] = '(';
            print(n, i + 1, arr, oc + 1, cc);
        }
        if (cc < oc) {
            arr[i] = ')';
            print(n, i + 1, arr, oc, cc + 1);
        }
    }

    public static void main(String[] args) {
        char arr[] = new char[6];
        print(6, 0, arr, 0, 0);
    }
}
