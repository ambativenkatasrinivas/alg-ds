package com.srinivas.hackerrank.gametheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NimbleGame {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            int size = Integer.parseInt(bufferedReader.readLine());
            long arr[] = new long[size];
            String input = bufferedReader.readLine();
            String[] inputs = input.split(" ");
            for (int i = 0; i < size; i++) {
                arr[i] = Long.parseLong(inputs[i]);
            }
            stringBuffer.append(nimbleGame(arr, size)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    static String nimbleGame(long[] s, int size) {
        int sum = 0;
        for (int i = 1; i < s.length; i++) {
            sum += s[i];
        }
      //  System.out.println("sum= "+sum);
        if (sum == 0) {
            return "Second";
        }
        if (size % 2 == 0) {
            return "Second";
        } else {
            return "First";
        }
    }
}
