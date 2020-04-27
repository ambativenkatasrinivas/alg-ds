package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ComputeAPowerB4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        int noip = Integer.parseInt(firstLine);
        while (noip > 0) {
            String ip = bufferedReader.readLine();
            stringBuilder.append(computeAPowerB(ip) + "\n");
            noip--;
        }
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        log.write(stringBuilder.toString());
        log.flush();
    }

    static long computeAPowerB(String input) {
        String inputs[] = input.split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        long pow = power(a, b);
        long m = 1000000007;
        return pow % m;
    }

    static long power(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b % 2 == 0) {
            return power(a, b / 2) * power(a, b / 2);
        } else {
            return a * power(a, b / 2) * power(a, b / 2);
        }
    }
}
