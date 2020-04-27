package com.srinivas.hackerrank.smartinterview.page1_7;

import com.sun.imageio.plugins.common.I18N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingFrequency {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        String input = bufferedReader.readLine();
        String stringArr[] = input.split(" ");
        int arr[] = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        int[] countArr = new int[100000];
        int[] negativeCountArr = new int[100000];
        getCountArr(arr, countArr, negativeCountArr);
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            int q = Integer.parseInt(bufferedReader.readLine());
            if (q > 0) {
                stringBuilder.append(countArr[q]).append("\n");
            } else {
                stringBuilder.append(negativeCountArr[negativeCountArr.length + q]).append("\n");
            }
            t--;
        }
        System.out.println(stringBuilder);
    }

    static int[] getCountArr(int[] arr, int[] countArr, int[] negativeCountArr) {
        for (int i = 0; i < arr.length; i++) {
            if (0 <= arr[i]) {
                countArr[arr[i]] += 1;
            } else {
                negativeCountArr[negativeCountArr.length + arr[i]] += 1;
            }
        }
        return countArr;
    }
}
