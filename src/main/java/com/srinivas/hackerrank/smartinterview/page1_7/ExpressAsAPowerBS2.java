package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpressAsAPowerBS2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        //int t = Integer.parseInt(bufferedReader.readLine());

//        while (t > 0) {
//            stringBuilder.append(expressAsAPowerB(Integer.parseInt(bufferedReader.readLine()))).append("\n");
//            t--;
//        }
        expressAsAPowerB(1);
        System.out.println(stringBuilder);
    }

    private static void expressAsAPowerB(int n1) {
        for (int n = 2; n < 1000000; n++) {
            for (int i = 2; i <= n/2; i++) {
                int a = i;
                for (int j = 2; j <= 9; j++) {
                    a = a * i;
                    if (a == n) {
                        System.out.println("n= " + n + " a = " + i + "b = " + j);
//                        return "Yes";
                        System.out.println("Yes");
                    }
                }
            }
        }
        System.out.println("No");
//        return "No";
    }
}
