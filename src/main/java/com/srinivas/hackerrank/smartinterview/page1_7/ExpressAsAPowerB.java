package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressAsAPowerB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t > 0) {
            stringBuilder.append(expressAsAPowerB(Integer.parseInt(bufferedReader.readLine()))).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static String expressAsAPowerB(int n) {

        for (int i = 2; i < n; i++) {
            int a = i;
            for (int j = 2; j < n; j++) {
                a = a * a;
                if (a == n) {
                    return "Yes";
                }
            }
        }
        return "No";
    }
}
