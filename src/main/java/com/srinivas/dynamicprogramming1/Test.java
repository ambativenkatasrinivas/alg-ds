package com.srinivas.dynamicprogramming1;

/**
 * T(0) = T(1) = 2
 * T(n) = E(i=1 - n-1) 2*T(i)*T(i-1) for n>1
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(T(3));
        System.out.println(T(4));
        System.out.println(T(5));
        System.out.println(T(6));
    }

    static int arr[] = new int[1024];

    //ITBU(Iterative, Tabbulation, bottom up)
    private static int T(int n) {
        int arr[] = new int[1024];
        arr[0] = 2;
        arr[1] = 2;
        for (int i = 2; i <= n; i++) {
            arr[i] = 0;
            for (int j = 1; j < i; j++) {
                arr[i] += 2 * arr[j] * arr[j - 1];
            }
        }
        return arr[n];
    }

    private static int TR(int n) {
        int sum = 0;
        if (arr[n] != 0) {
            return arr[n];
        }
        if (n == 0 || n == 1) {
            arr[0] = 2;
            arr[1] = 2;
            return 2;
        } else {
            for (int i = 1; i < n; i++) {
                sum += 2 * T(i) * T(i - 1);
                System.out.println("i= " + i + " sum= " + sum);
            }
        }
        return arr[n] = sum;
    }
}
