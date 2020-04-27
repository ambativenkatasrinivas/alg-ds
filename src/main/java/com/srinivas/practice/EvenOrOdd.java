package com.srinivas.practice;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < 32; i++) {
            System.out.println(i + " ->  "+setOrNot(n, i));
        }
    }

    static boolean setOrNot(int n, int i) {
        if (((n >> i) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
