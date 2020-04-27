package com.srinivas.hackerrank.smartinterview.page4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindingTheFloor {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String[] ele = bufferedReader.readLine().split(" ");
        int[] arr = new int[ele.length];
        for (int i = 0; i < ele.length; i++) {
            arr[i] = Integer.parseInt(ele[i]);
        }
        Arrays.sort(arr);
        int qs = Integer.parseInt(bufferedReader.readLine());
        while (qs > 0) {
            int q = Integer.parseInt(bufferedReader.readLine());
            stringBuffer.append(findingTheFloor(arr, 0, arr.length - 1, q)).append("\n");
            qs--;
        }

        System.out.println(stringBuffer);
    }

    private static int findingTheFloor(int[] arr, int low, int high, int q) {
        int i = low, j = high;
        int floor = Integer.MIN_VALUE;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (q == arr[mid]) {
                return arr[mid];
            } else if (q > arr[mid]) {
                i = mid + 1;
                floor = arr[mid];
            } else {
                j = mid - 1;
            }
        }
        return floor;
    }

}
