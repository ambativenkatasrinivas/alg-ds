package com.srinivas.practice;

public class Paranthasis {

    static void paranthasis(int n, char arr[], int idx, int open, int close) {
        if (idx == n) {
            for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
            System.out.println();
        }
        if (open < n / 2) {
            arr[idx] = '(';
            paranthasis(n, arr, idx+1, open+1, close);
        }
        if (open > close) {
            arr[idx] = ')';
            paranthasis(n, arr, idx+1, open, close+1);
        }
    }
    public static void main(String[] args) {
        paranthasis(6, new char[6],0,0,0);
    }
}


