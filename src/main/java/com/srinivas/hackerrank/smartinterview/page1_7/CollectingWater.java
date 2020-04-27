package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectingWater {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            bufferedReader.readLine();
            String input = bufferedReader.readLine();
            String[] inputs = input.split(" ");
            int arr[] = new int[inputs.length];
            for (int i=0;i<inputs.length;i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }
            stringBuilder.append(collectingWater(arr)).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
//        int arr[] = {1, 6, 2, 4, 5, 7, 9};
//        System.out.println(collectingWater(arr));
    }

    public static int collectingWater(int[] arr) {
        int[] pm = new int[arr.length];
        int[] sm = new int[arr.length];
        pm[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            pm[i] = Math.max(arr[i], pm[i - 1]);
           // System.out.print(" " + pm[i]);
        }
//        System.out.println();
        sm[arr.length - 1] = arr[arr.length - 1];
        for (int i = 1; i <= arr.length-1; i++) {
            sm[arr.length-1-i] = Math.max(arr[arr.length-1-i], sm[arr.length-i]);
            //System.out.print(" " + sm[arr.length-1-i]);
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += Math.min(pm[i], sm[i]) - arr[i];
        }
        return ans;
    }
}
