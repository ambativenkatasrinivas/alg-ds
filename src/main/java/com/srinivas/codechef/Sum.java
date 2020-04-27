package com.srinivas.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int noofSums = Integer.parseInt(bufferedReader.readLine());
        String[] lines = new String[noofSums];
        int lineNo = 0;
        while (lineNo < noofSums) {
            String line = bufferedReader.readLine();
            if (!line.equals("")) {
                lines[lineNo] = line;
                lineNo++;
            }
        }
        for (String line : lines) {
            String numbers[] = line.split(" ");
            int number1 = Integer.parseInt(numbers[0]);
            int number2 = Integer.parseInt(numbers[1]);
            System.out.println(number1 + number2);
        }
    }
}
