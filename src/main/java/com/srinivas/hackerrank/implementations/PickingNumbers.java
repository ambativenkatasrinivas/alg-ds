package com.srinivas.hackerrank.implementations;

import com.srinivas.common.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String noofLines = bufferedReader.readLine();
        int size = Integer.parseInt(noofLines);
        String numbersLine = bufferedReader.readLine();
        String numbers[] = numbersLine.split(" ");
        List<Integer> list = new ArrayList<>();
        for (String stringNumber : numbers) {
            list.add(Integer.parseInt(stringNumber));

        }
        System.out.println(pickingNumbers(list));
    }

    public static int pickingNumbers(List<Integer> a) {
        int arr[] = getArray(a);
        int subArray[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp[] = new int[arr.length];
            int tempIndex = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[i] - arr[j]) == 0 || (arr[i] - arr[j]) == 1 || (arr[j] - arr[i]) == -1) {
                    temp[tempIndex++] = arr[j];
                }
            }
            Util.print(temp);
            if (countOfArray(subArray)<countOfArray(temp)) {
                subArray = temp;
            }
        }
        return countOfArray(subArray)-1;
    }

    static int[] getArray(List<Integer> a) {
        int temp[] = new int[a.size()];
        int index = 0;
        for (int x: a) {
            temp[index++] = x;
        }
        return temp;
    }
    static int countOfArray(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;
            }
        }
        return count;
    }

}
