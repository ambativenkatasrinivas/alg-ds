package com.srinivas.hackerrank.smartinterview.page7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KillingDragons_s1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (q > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String aString[] = bufferedReader.readLine().split(" ");
            int a[] = new int[aString.length];
            for (int i = 0; i < aString.length; i++) {
                a[i] = Integer.parseInt(aString[i]);
            }
            String bString[] = bufferedReader.readLine().split(" ");
            int b[] = new int[aString.length];
            for (int i = 0; i < aString.length; i++) {
                b[i] = Integer.parseInt(bString[i]);
            }
            stringBuilder.append(killingDragons(a, b)).append("\n");
            q--;
        }
        System.out.println(stringBuilder);
    }

    private static String killingDragons(int[] a, int[] b) {
        long aSum[] = new long[a.length];
        long bSum[] = new long[b.length];
        aSum[0] = a[0];
        bSum[0] = b[0];
        for (int i = 1; i < a.length; i++) {
            aSum[i] = aSum[i-1] + a[i];
            bSum[i] = bSum[i-1] + b[i];
        }

        if (aSum[aSum.length - 1] > bSum[bSum.length - 1]) {
            return "-1";
        }

        int firstI=-1;
        for (int i = aSum.length - 1; i >= 0; i--) {
            if (aSum[i] > bSum[i]) {
                firstI =i;
            }
        }

        if (firstI >= 0 ) {
            if (a[firstI] > b[firstI]){
                while (a[firstI] > b[firstI]) {
                    firstI++;
                }
                return (firstI+1) + "";
            } else{
                return (firstI + 2) + "";
            }
        }
//        for (int i =firstI;i<a.length;i++) {
//
//        }
        return "1";
    }
}
