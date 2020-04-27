package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOf2Matrices {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {

            String string1 = bufferedReader.readLine();
            String[] string1Arr = string1.split(" ");
            int n1 = Integer.parseInt(string1Arr[0]);
            int m1 = Integer.parseInt(string1Arr[1]);

              int arr1[][] = readMatrix(n1, m1, bufferedReader);

            String string2 = bufferedReader.readLine();
            String[] string2Arr = string2.split(" ");
            int n2 = Integer.parseInt(string2Arr[0]);
            int m2 = Integer.parseInt(string2Arr[1]);

            int arr2[][] = readMatrix(n2, m2, bufferedReader);
            productOf2Matrices(arr1,arr2);
        }

//        int arr[][] = {
//                {-1, 4},
//                {2, 3}
//        };
//        int arr1[][] = {
//                {9, -3},
//                {6, 1}
//        };
//        productOf2Matrices(arr, arr1);
    }

    static int[][] readMatrix(int n, int m, BufferedReader bufferedReader) throws IOException {
        int arr[][] = new int[n][m];
        for (int i=0;i<n;i++) {
            String line = bufferedReader.readLine();
            String[] lineArr = line.split(" ");
            for (int j=0;j<m;j++){
                arr[i][j] = Integer.parseInt(lineArr[j]);
            }
        }
        return arr;
    }

    static void productOf2Matrices(int arr[][], int arr1[][]) {
        int arr2[][] = new int[arr.length][arr1[0].length];

        for (int k = 0; k < arr.length; k++) {
            for (int i = 0; i < arr1[0].length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    arr2[k][i] = arr2[k][i] + (arr[k][j] * arr1[j][i]);
                }
                //System.out.print(arr2[k][i] + "  ");
            }
            //System.out.println();
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(" "+arr2[i][j]);
            }
            System.out.println();
        }

    }
}
