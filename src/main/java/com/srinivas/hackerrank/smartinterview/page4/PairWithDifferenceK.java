package com.srinivas.hackerrank.smartinterview.page4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//        2
//        5 60
//        1 20 40 100 80
//        10 11
//        12 45 52 65 21 645 234 14 575 112
public class PairWithDifferenceK {

    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String[] nk = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(nk[0]);
            int k = Integer.parseInt(nk[1]);
            String[] ele = bufferedReader.readLine().split(" ");
            int[] arr = new int[ele.length];
            for (int i=0;i<ele.length;i++) {
                arr[i] = Integer.parseInt(ele[i]);
            }
            Arrays.sort(arr);
            stringBuffer.append(pairWithDifferenceK(arr, k)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    private static String pairWithDifferenceK(int[] arr, int k ) {
        for (int i=0;i<arr.length;i++) {
            if(findingTheFloor(arr,0,arr.length-1, k+arr[i], i)) {
                return "true";
            }
        }
        return "false";
    }

    private static boolean findingTheFloor(int[] arr, int low, int high, int q, int position) {
        int i = low, j = high;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (q == arr[mid] && position != mid) {
                return true;
            } else if (q > arr[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return false;
    }
}
