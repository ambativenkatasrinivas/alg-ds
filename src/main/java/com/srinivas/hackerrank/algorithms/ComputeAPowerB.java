package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputeAPowerB {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        System.out.println();
        int arr[] = new int[n * 2];
        int count = 0;
        while (count < (n * 2)-2) {
            String numbersLine = bufferedReader.readLine();
            String numbers[] = numbersLine.split(" ");
            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);
            arr[count++] = a;
            arr[count++] = b;
        }

        for (int i = 0; i <= arr.length / 2; i=i+2) {
            printAPowerB(arr[i], arr[i + 1]);
        }
    }

    static void printAPowerB(int a, int b) {
        long power = 1;
        for (int i = 1; i <= b; i++) {
            power = power * a;
        }
        System.out.println(power);
    }
}
