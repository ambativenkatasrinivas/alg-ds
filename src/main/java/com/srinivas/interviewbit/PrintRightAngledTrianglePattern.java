package com.srinivas.interviewbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PrintRightAngledTrianglePattern {
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
        Arrays.sort(input);
        int caseCount = 1;
        for (int n : input) {
            System.out.println("Case #" + caseCount + ":");
            caseCount++;
            printHollowDiamondPattern((n / 2) + 1, (n / 2) + 1, n);
        }
    }

    static void printHollowDiamondPattern(int x, int y, int n) {
        while (x != 1 || y != n) {
            printLine(x, y, n);
            x = x - 1;
            y = y + 1;
        }
        while (x != y) {
            printLine(x, y, n);
            x = x + 1;
            y = y - 1;
        }
        printLine(x, y, n);
    }

    static void printLine(int x, int y, int n) {
        for (int i = 1; i <= n; i++) {
            if (i == x || i == y) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
