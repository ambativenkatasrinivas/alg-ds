package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeAPowerB2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);
        String input[] = new String[noip];
        int index = 0;
        while (noip > 0) {
            input[index++] = bufferedReader.readLine();
            noip--;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s: input) {
            stringBuilder.append(computeAPowerB(s)+"\n");
        }
        System.out.println(stringBuilder.toString());
    }

    static long computeAPowerB(String input) {
        String inputs[] = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        long temp = 1;
        long m = 1000000007;
        for (int i = 1; i <= b; i++) {
            temp =(temp*a)%m;
        }
        return temp;
    }
}
