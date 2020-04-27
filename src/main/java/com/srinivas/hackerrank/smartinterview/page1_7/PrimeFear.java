package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFear {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        int n = Integer.parseInt(bufferedReader.readLine());
        int N = 1000000;
        boolean isNotPrime[] = new boolean[N + 1];
        int countArray[] = new int[N + 1];

        for (int i = 2; i * i <= N; i++) {
            if (!isNotPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }
        // Step 2
        isNotPrime[0] = true;
        isNotPrime[1] = true;
        for (int i = 2; i <= N; i++) {
            if (!isNotPrime[i] && (isContainsZero(i) || isTruncateNumberPrime(i, isNotPrime))) {
                isNotPrime[i] = true;
            }
        }
        // Step 3
        countArray[0] = 0;

        for (int i = 1; i < countArray.length; i++) {
            if (!isNotPrime[i]) {
                countArray[i] += countArray[i - 1] + 1;
            } else {
                countArray[i] = countArray[i - 1];
            }
        }
        while (n > 0) {
            int q = Integer.parseInt(bufferedReader.readLine());
            stringBuilder.append(countArray[q]).append("\n");
            n--;
        }
        System.out.println(stringBuilder);
//        for (int i = 1; i <= N; i++) {
//            if (!isNotPrime[i]) {
//                System.out.println(i);
//            }
//        }
    }

    static boolean isContainsZero(int n) {
        while (n > 0) {
            int ld = n % 10;
            if (ld == 0) {
                return true;
            }
            n = n / 10;
        }
        return false;
    }

    static boolean isTruncateNumberPrime(int i, boolean[] isNotPrime) {
        int n = i;
        int number = 0;
        int position = 1;
        while (n > 0) {
            int last = n % 10;
            number += position * last;
            position = position * 10;
            n = n / 10;
            if (i!=number && isNotPrime[number]) {
                return true;
            }
        }
        return false;
    }
}
