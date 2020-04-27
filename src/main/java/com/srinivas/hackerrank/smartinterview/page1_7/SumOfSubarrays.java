package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class SumOfSubarrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String size = bufferedReader.readLine();
        String input = bufferedReader.readLine();
        String[] strings = input.split(" ");
        long[] arr = new long[strings.length];
        arr[0] = Long.parseLong(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            arr[i] = Long.parseLong(strings[i]) + arr[i - 1];
           // System.out.print(" "+arr[i]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int q = Integer.parseInt(bufferedReader.readLine());
        while (q > 0) {
            String ijString = bufferedReader.readLine();
            String[] ijs = ijString.split(" ");
            int i = Integer.parseInt(ijs[0]);
            int j = Integer.parseInt(ijs[1]);
            stringBuilder.append(sumOfSubarrays(arr, i, j)).append("\n");
            q--;
        }
        System.out.println(stringBuilder);
    }

    public static long sumOfSubarrays(long arr[], int i, int j) {
        if ( i==0) {
            return arr[j];
        }
        return arr[j] - arr[i-1];
    }
}
