package com.srinivas.practice;

public class OverFlowOnAddition {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        long a = 9223372036854775797l;
        long b = 10;

        b = 1;
        System.out.println(isOverFlowed(a, b, a + b));
        b = 10;
        System.out.println(isOverFlowed(a, b, a + b));
        b = 11;
        System.out.println(isOverFlowed(a, b, a + b));
        b = 9000000000000000000l;
        System.out.println(isOverFlowed(a, b, a + b));
        b = 9223372036854775807l;
        System.out.println(isOverFlowed(a, b, a + b));

    }

    private static boolean isOverFlowed(long a, long b, long sum) {
        if (sum > 0) {
            return false;
        } else {
            return true;
        }
    }
}
