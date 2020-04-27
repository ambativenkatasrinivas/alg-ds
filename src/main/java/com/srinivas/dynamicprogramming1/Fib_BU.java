package com.srinivas.dynamicprogramming1;


// In bottom up approach start building function for lower level of input and
// keep building the solution for higher values
public class Fib_BU {
    public static void main(String[] args) {
        System.out.println(getFib(1));
        System.out.println(getFib(2));
        System.out.println(getFib(3));
        System.out.println(getFib(4));
        System.out.println(getFib(5));
    }

    public static int getFib(int n) {
        int fib[] = new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i=2;i<=n;i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[n];
    }
}
