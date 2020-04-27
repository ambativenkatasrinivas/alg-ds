package com.srinivas.practice;

public class OverflowOnMultiplication {
    public static void main(String[] args) {
        System.out.println(overflowOnMultiplication(10, 10));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 1));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 2));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 3));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 4));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 5));
        System.out.println(overflowOnMultiplication(Integer.MAX_VALUE, 10));
    }

    private static boolean overflowOnMultiplication(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        } else {
            int mul = a * b;
            if (mul / b == a) {
                return true;
            } else {
                return false;
            }
        }
    }
}
