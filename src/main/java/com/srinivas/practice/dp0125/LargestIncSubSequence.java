package com.srinivas.practice.dp0125;

import java.util.Arrays;

public class LargestIncSubSequence {
    public static void main(String[] args) {
//        int[] arr = {3, -1, 2, 5, 4, -4, -7, 11, 5, 9, 19, 8, 7};
        int[] arr = {0, 4, 12, 2, 10, 6, 9, 13, 3, 11, 7, 15};
        largestIncSubSeq(arr);
    }

    private static void largestIncSubSeq(int[] arr) {
        int[] dp = new int[arr.length];
        int[] subSeq = new int[arr.length];
//        for (int i = 0; i <dp.length ; i++) {
//            dp[i] = 1;
//        }
            dp[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j]+1;
                    subSeq[i] = j;
                }
            }
//            dp[i]++;
        }

//        System.out.println(Arrays.stream(dp).max().getAsInt());
        int maxValue = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < dp.length; i++) {
            if (maxValue < dp[i]) {
                maxValue = dp[i];
                maxIdx = i;
            }
        }
        System.out.println(maxValue);

        int idx = maxIdx;
        while (idx > 0) {
            System.out.println(arr[idx]);
            idx = subSeq[idx];
        }

    }
}
