package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SpiralTraversalOfMatrix {
//    public static void main(String[] args) {
//        int arr[][] = {
//                {-44, 25, -52, 69, -5},
//                {17, 22, 51, 27, -44},
//                {-79, 28, -78, 1, -47},
//                {65, -77, -14, -21, -6},
//                {-96, 43, -21, -20, 90}
//        };
//
//        int arr1[][] = {
//                {1, 2, 3},
//                {8, 9, 4},
//                {7, 6, 5}
//        };
//
//        int arr2[][] = {
//                {1, 2},
//                {4, 3}
//        };
//
//        int arr3[][] = {
//                {1}
//        };
//        spiralTraversalOfMatrix(arr3);
//    }

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t > 0) {
            int arrSize = Integer.parseInt(bufferedReader.readLine());
            int arr[][] = new int[arrSize][arrSize];
            int i = 0;
            while (i < arrSize) {
                String arrElements = bufferedReader.readLine();
                String arrElementsArr[] = arrElements.split(" ");
                for (int j = 0; j < arrSize; j++) {
                    arr[i][j] = Integer.parseInt(arrElementsArr[j]);
                }
                i++;
            }
            stringBuilder.append(spiralTraversalOfMatrix(arr)).append("\n");
            t--;
        }
        System.out.println(stringBuilder.toString());
    }
    static StringBuilder spiralTraversalOfMatrix(int arr[][]) {
        int i = -1, j = -1, k1 = 0, k2 = arr.length - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while (k1 <= k2) {
            i++;
            j++;
            while (j <= k2) {
                stringBuilder.append(arr[i][j] + " ");
//                System.out.print(arr[i][j] + " ");
                j++;
            }
            j--;
            i++;
            while (i <= k2) {
                stringBuilder.append(arr[i][j] + " ");
            //    System.out.print(arr[i][j] + " ");
                i++;
            }
            i--;
            i--;
            while (i >= k1) {
                stringBuilder.append(arr[j][i] + " ");
//                System.out.print(arr[j][i] + " ");
                i--;
            }
            j--;
            i++;
            k1++;
            while (j >=k1 ) {
                stringBuilder.append(arr[j][i] + " ");
//                System.out.print(arr[j][i] + " ");
                j--;
            }
            k2--;
        }
        return stringBuilder;
    }

}
