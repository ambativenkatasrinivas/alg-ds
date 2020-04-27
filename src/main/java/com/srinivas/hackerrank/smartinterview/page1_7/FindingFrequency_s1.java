package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FindingFrequency_s1 {
    public static void main(String[] args) throws IOException {
//        int[] arr = {-1, -1, -1, -1, 5, 8, 10, 10, 10, 10, 11, 12};
//        int high = getHigh(arr, -1);
//        System.out.println("Element found at: " + high);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        String input = bufferedReader.readLine();
        String stringArr[] = input.split(" ");
        int arr[] = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(arr);
        while (t > 0) {
            int q = Integer.parseInt(bufferedReader.readLine());
            int start = getLow(arr, q);
            int end = getHigh(arr, q);
            int count = 0;
//            for (int i = start; i < arr.length; i++) {
//                if (arr[i] == q) {
//                    count++;
//                } else {
//                    break;
//                }
//            }
            stringBuilder.append((end - start) + 1).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static int getHigh(int[] arr, int x) {
        int fountAt = -1;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                low = mid + 1;
                fountAt = mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return fountAt;
    }

    private static int getLow(int[] arr, int x) {
        int fountAt = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] == x) {
                high = mid - 1;
                fountAt = mid;
            } else if (arr[mid] > x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return fountAt;
    }
}
