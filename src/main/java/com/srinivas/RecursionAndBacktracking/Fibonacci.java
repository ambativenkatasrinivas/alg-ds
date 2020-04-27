package com.srinivas.RecursionAndBacktracking;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }

    static int fibonacci(int n) {
        if (n == 0 ) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else{
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
