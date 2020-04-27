package com.srinivas.smartinterview.week5.day1;

public class AllChars {
    public static void main(String[] args) {
        for (int i=0;i<128;i++) {
            System.out.print(" " + (char) i );
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
