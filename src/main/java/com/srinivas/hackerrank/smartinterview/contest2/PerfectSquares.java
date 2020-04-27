package com.srinivas.hackerrank.smartinterview.contest2;

public class PerfectSquares {
    public static void main(String[] args) {
        long a = 1, b = 1000000000;
        CountSquares obj = new CountSquares();
        System.out.print("Count of squares is " + (int) obj.countSquares(a, b));
    }
}