package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinctlEmentsInWindow {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            String firstLine = bufferedReader.readLine();
            String[] nk = firstLine.split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            int arr[] = new int[n];
            String secondLine = bufferedReader.readLine();
            String elements[] = secondLine.split(" ");

            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }

            stringBuilder.append(distinctlEmentsInWindow(arr, k)).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static StringBuilder distinctlEmentsInWindow(int[] arr, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }
        }
        stringBuilder.append(map.size()).append(" ");
        for (int i = k; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);

            } else {
                map.put(arr[i], 1);
            }

            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i - k]) == 0) {
                map.remove(arr[i - k]);
            }
            stringBuilder.append(map.size()).append(" ");
        }

        return stringBuilder;
    }
}
