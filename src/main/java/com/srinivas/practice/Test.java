package com.srinivas.practice;

public class Test {
    public static void main(String[] args) {
        System.out.println("" + Integer.toBinaryString(1) + " " + (1 << 0));
        System.out.println("" + Integer.toBinaryString(2) + " " + (1 << 1));
        System.out.println("" + Integer.toBinaryString(4) + " " + (1 << 2));
        System.out.println("" + Integer.toBinaryString(8) + " " + (1 << 3));
        System.out.println("" + Integer.toBinaryString(16) + " " + (1 << 4));
        System.out.println("" + Integer.toBinaryString(32) + " " + (1 << 5));

        System.out.println("---------------------------------------------------------------------------------");

        int m = new Double(10e9 + 7).intValue();
        System.out.println("m====== " + m);
        System.out.println("---------------------------------------------------------------------------------");

        int value = 0;
        for (int i = 0; i < 31; i++) {
            value = value << 1;
            value = value | 1;
            System.out.println(value);
        }
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE < 10e9+7);
    }
}
