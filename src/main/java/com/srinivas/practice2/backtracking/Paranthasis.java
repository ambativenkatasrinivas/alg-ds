package com.srinivas.practice2.backtracking;

public class Paranthasis {

    private static void allComParan(int n, int idx, char[] arr, int oc, int cc) {
        if (n == idx) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        if (oc < n / 2) {
            arr[idx] = '(';
            allComParan(n, idx+1, arr, oc + 1, cc);
        }

        if (cc < oc){
            arr[idx] = ')';
            allComParan(n, idx+1, arr, oc, cc + 1);
        }
    }

    public static void main(String[] args) {
        allComParan(6, 0, new char[6], 0, 0);
    }
}
