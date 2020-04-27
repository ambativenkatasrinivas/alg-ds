package com.srinivas.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotationOfMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);
        int testCaseCount = 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (noip > 0) {
            int size = Integer.parseInt(bufferedReader.readLine());
            int arr[][] = new int[size][size];

            for (int i = 0; i < size; i++) {
                String line = bufferedReader.readLine();
                String[] elements = line.split(" ");
                for (int j = 0; j < size; j++) {
                    arr[i][j] = Integer.parseInt(elements[j]);
                }
            }
            printMatrix(arr);
            stringBuilder.append("Test Case #"+testCaseCount+":").append("\n");
            testCaseCount++;
            stringBuilder.append(printMatrix(arr));
            noip--;
        }
        System.out.println(stringBuilder.toString().substring(0,stringBuilder.length()-1));
    }

    static StringBuilder printMatrix(int[][] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < arr.length; j++) {
            for (int i = arr.length - 1; i >= 0; i--) {
                stringBuilder.append(arr[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder;
    }
}
