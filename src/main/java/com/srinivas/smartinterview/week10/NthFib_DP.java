package com.srinivas.smartinterview.week10;

public class NthFib_DP {

    public static void main(String[] args) {
        fib[0] = 0;
        fib[1] = 1;
        System.out.println("count= " + count + " 10 =  " + getFib(10));
        System.out.println("count= " + count + " 11 = " + getFib(11));
        System.out.println("count= " + count + " 11 = " + getFib(12));
    }

    static int count = 0;
    static int[] fib = new int[1000];

    private static int getFib(int n) {
        for (int i = 2; i <= n; i++) {
            if (fib[i] == 0) {
                count++;
                fib[i] = fib[i - 2] + fib[i - 1];
            }
        }
        return fib[n];
    }

}
