package com.srinivas.practice;

import static java.lang.Math.*;

public class CountSetBits {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        System.out.println(log(256)/log(2));
        for (int i = 0; i <= log(n)/log(2); i++) {
            System.out.print(" "+i);
            if (checkBit(n, i)) {
                count++;
            }
        }
        System.out.println();
        System.out.println(" Total no.of set bits is:  "+count);
    }

    static boolean checkBit(int n, int i) {
        if (((n >> i) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
