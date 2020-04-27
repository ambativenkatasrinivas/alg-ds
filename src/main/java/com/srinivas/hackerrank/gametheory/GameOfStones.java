package com.srinivas.hackerrank.gametheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfStones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            stringBuffer.append(gameOfStones(n)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    static String gameOfStones(int n) {
        if (n <= 1) {
            return "Second";
        } else if (n % 7 == 0 || (n - 1) % 7 == 0) {
            return "Second";
        } else {
            return "First";
        }
    }
}

