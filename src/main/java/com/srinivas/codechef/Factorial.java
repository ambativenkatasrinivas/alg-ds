package com.srinivas.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Factorial {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int noofSums = 0;
        String temp = bufferedReader.readLine();
        if(temp != null) {
            noofSums = Integer.parseInt(temp);
            String[] lines = new String[noofSums];
            int lineNo = 0;
            while (lineNo < noofSums) {
                String line = bufferedReader.readLine();
                if (line!=null && !line.equals("")) {
                    lines[lineNo] = line;
                    lineNo++;
                }
            }
            System.out.println();
            for (String line : lines) {
                printFactorial(Integer.parseInt(line));
            }
        }
    }

    static int arr[] = new int[500];

    static void printFactorial(int n) {
        for(int x=0;x<200;x++)
            arr[x] = 0;
        arr[0] = 1;
        if (n == 0) {
            System.out.println(1);
        } else {
            int m = 1;
            for (int i = 1; i <= n; i++) {
                m = multiply(i, m);
            }
            System.out.println();
            while (m>0) {
                m--;
                System.out.print(arr[m]);
            }
        }
    }

    static int multiply(int multiplicant, int m) {
        int index = 0;
        int temp = 0;
        while (index < m) {
            temp = arr[index] * multiplicant + temp;
            arr[index] = temp % 10;
            temp = temp / 10;
            index++;
        }

        while (temp > 0) {
            arr[index] = arr[index] + (temp % 10);
            temp = temp / 10;
            m++;
            index++;
        }
        return m;
    }
}
