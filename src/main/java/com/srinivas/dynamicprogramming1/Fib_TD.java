package com.srinivas.dynamicprogramming1;

public class Fib_TD {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println(getFib(1, arr));
        System.out.println(getFib(2, arr));
        System.out.println(getFib(3, arr));
        System.out.println(getFib(4, arr));
        System.out.println(getFib(5, arr));
    }

    public static int getFib(int n, int[] arr) {
        if (n == 0) {
            arr[0] = 0;
            return 0;
        }
        if (n == 1) {
            arr[1] = 1;
            return 1;
        }
        if (arr[n] != 0){
            return arr[n];
        }
        return arr[n] = getFib(n - 1, arr) + getFib(n - 2, arr);
    }
}
