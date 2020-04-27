package com.srinivas.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int noofSums = 0;
        String temp = bufferedReader.readLine();
        if (temp != null) {
            noofSums = Integer.parseInt(temp);
            String[] lines = new String[noofSums];
            int lineNo = 0;
            while (lineNo < noofSums) {
                String line = bufferedReader.readLine();
                if (line != null && !line.equals("")) {
                    lines[lineNo] = line;
                    lineNo++;
                }
            }
            System.out.println();
            for (String line : lines) {
                sumOfDigits(Integer.parseInt(line));
            }
        }
    }

    static void sumOfDigits(int num) {
        int total = 0;
        while (num > 0) {
            total = total + (num % 10);
            num = num / 10;
        }
        System.out.println(total);
    }
}
