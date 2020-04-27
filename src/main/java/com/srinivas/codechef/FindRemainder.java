package com.srinivas.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindRemainder {
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
                String numbers[] = line.split(" ");
                long number1 = Long.parseLong(numbers[0]);
                long number2 = Long.parseLong(numbers[1]);
                findRemainder(number1, number2);
            }
        }
    }

    static void findRemainder(long num1, long num2) {
        System.out.println(num1%num2);
    }
}
