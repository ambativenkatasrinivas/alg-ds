package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.log;

public class CheckPowerOfTwo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);
        StringBuilder stringBuilder = new StringBuilder();
        while (noip > 0) {
            long num = Long.parseLong(bufferedReader.readLine());
            stringBuilder.append(checkPowerOfTwo(num) + "\n");
            noip--;
        }
        System.out.println(stringBuilder.toString());
        //System.out.println(checkPowerOfTwo(520L));
    }

    static String checkPowerOfTwo(long num) {
        int count = 0;
        for (int i = 0; i <= log(num) / log(2); i++) {
            if (checkBit(num, i)) {
                count++;
            }
        }
        if (count == 1) {
            return "True";
        } else {
            return "False";
        }
    }

    static boolean checkBit(long n, int i) {
        if (((n >> i) & 1) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
