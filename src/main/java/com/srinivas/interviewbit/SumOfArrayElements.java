package com.srinivas.interviewbit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfArrayElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);

        long[] result = new long[noip];
        int r = 0;

        while (noip > 0) {
            int arrSize = Integer.parseInt(bufferedReader.readLine());
            long arr[] = new long[arrSize];
            String stringArr[] = bufferedReader.readLine().split(" ");
            for (int i = 0; i < arrSize; i++) {
                arr[i] = Long.parseLong(stringArr[i]);
            }
            result[r] = getSum(arr);
            r = r+1;
            noip = noip-1;
        }
        for (long x: result) {
        System.out.println(x);
    }
    }

    static long getSum(long arr[]) {
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
