package com.srinivas.interviewbit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class PrintHollowDiamondPattern2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);
        int input[] = new int[noip];
        int index = 0;
        while (noip > 0) {
            input[index++] = Integer.parseInt(bufferedReader.readLine());
            noip--;
        }

        int caseCount = 1;
        for (int n : input) {
            System.out.println("Case #" + caseCount + ":");
            caseCount++;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder = printHollowDiamondPattern((n / 2) + 1, (n / 2) + 1, n);
            BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
//            log.write(stringBuilder.toString().substring(0,stringBuilder.length()-1));
            log.write(stringBuilder.toString());
            log.flush();

        }
    }

    static StringBuilder printHollowDiamondPattern(int x, int y, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (x != 1 || y != n) {
            stringBuilder.append(printLine(x, y, n).toString());
            x = x - 1;
            y = y + 1;
        }
        while (x != y) {
            stringBuilder.append(printLine(x, y, n).toString());
            x = x + 1;
            y = y - 1;
        }
        return stringBuilder.append((printLine(x, y, n)).toString());
    }

    static StringBuilder printLine(int x, int y, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == x || i == y) {
                stringBuilder.append("*");
                //System.out.print("*");
            } else {
                stringBuilder.append(" ");
                //System.out.print(" ");
            }
        }
        stringBuilder.append("\n");
        //System.out.println();
        return stringBuilder;
    }
}