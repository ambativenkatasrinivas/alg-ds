package com.srinivas.hackerrank.smartinterview.page1_7;

import com.sun.imageio.plugins.common.I18N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubsetsOfAnArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String input = bufferedReader.readLine();
            String stringArr[] = input.split(" ");
            int arr[] = new int[stringArr.length];
            for (int i=0;i<arr.length;i++) {
                arr[i] = Integer.parseInt(stringArr[i]);
            }
            Arrays.sort(arr);
            //stringArr = arrReverse(stringArr);
            stringBuilder.append(subsetsOfAnArray(arr)).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static StringBuilder subsetsOfAnArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    if (i!=j)
                    stringBuilder.append(arr[k]).append(" ");
                }
                stringBuilder.append("\n");
            }
        }
        return stringBuilder;
    }

    private static String[] arrReverse(String[] input) {
        int p1 = 0;
        int p2 = input.length-1;
        while (p1 < input.length / 2) {
            String temp = input[p2];
            input[p2] = input[p1];
            input[p1] = temp;
            p1++;
            p2--;
        }
        return input;
    }

}
