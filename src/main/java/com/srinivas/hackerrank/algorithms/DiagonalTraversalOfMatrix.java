package com.srinivas.hackerrank.algorithms;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiagonalTraversalOfMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = bufferedReader.readLine();
        int noip = Integer.parseInt(firstLine);
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
            stringBuilder.append(getDiagonalMatrix(arr));
            noip--;
        }
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.length() - 1));
    }

    static StringBuilder getDiagonalMatrix(int arr[][]) {
        int length = arr.length - 1;
        int sums[] = new int[arr.length + (arr.length - 1)];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sums[length + (i - j)] = sums[length + (i - j)] + arr[i][j];
                } else if ((i < j) && i + (j - i) == j) {
                    sums[length - (j - i)] = sums[length - (j - i)] + arr[i][j];

                } else {
                    sums[length + (i - j)] = sums[length + (i - j)] + arr[i][j];
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < sums.length; i++) {
            stringBuilder.append(sums[i] + " ");
        }
        stringBuilder.append("\n");
        //Util.print(sums);
        return stringBuilder;
    }
}
