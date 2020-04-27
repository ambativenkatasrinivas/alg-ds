package com.srinivas.practice.bitmunupulation;

public class EvenOrOdd {
    private static void evenOrOdd(int n) {
        if ((n & 1) == 1) {
            System.out.println((n&1)+" Odd");
        } else {
            System.out.println((n&1)+" Even");
        }
    }

    public static void main(String[] args) {

        evenOrOdd(10);
        evenOrOdd(12);
        evenOrOdd(14);
        evenOrOdd(16);
        evenOrOdd(18);
        evenOrOdd(20);

        evenOrOdd(11);
        evenOrOdd(13);
        evenOrOdd(15);
        evenOrOdd(17);
        evenOrOdd(19);
        evenOrOdd(21);
    }
}
