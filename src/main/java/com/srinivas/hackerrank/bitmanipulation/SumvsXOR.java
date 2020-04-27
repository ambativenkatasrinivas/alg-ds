package com.srinivas.hackerrank.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumvsXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        printx(n);
//        for (int i=1;i<100;i++)
//        printx(i);

    }

    private static void printx(long n) {
            int count = 0;
        for (int x = 0; x <= n; x++) {
            if ((n + x) == (n ^ x)) {
                count++;
            }
        }
        System.out.println(n+" = "+count);
//        System.out.println(n^0);
    }
}
