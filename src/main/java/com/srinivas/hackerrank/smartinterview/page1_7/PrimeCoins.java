package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeCoins {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            stringBuilder.append(primeCoins(Long.parseLong(bufferedReader.readLine()))).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    public static String primeCoins(long n) {
        return n % 2 == 0 ? "Banta" : "Santa";
    }
}
