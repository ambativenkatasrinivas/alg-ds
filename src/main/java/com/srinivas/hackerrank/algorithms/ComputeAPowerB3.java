package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeAPowerB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        int noip = Integer.parseInt(firstLine);
        while (noip > 0) {
            String ip = bufferedReader.readLine();
            stringBuilder.append(computeAPowerB(ip)+"\n");
            noip--;
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
