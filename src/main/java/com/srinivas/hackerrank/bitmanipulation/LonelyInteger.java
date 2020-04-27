package com.srinivas.hackerrank.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        lonelyinteger(arr);
    }

    static int lonelyinteger(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            temp ^= a[i];
        }
        return temp;
    }
}
