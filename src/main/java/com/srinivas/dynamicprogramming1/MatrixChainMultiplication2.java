package com.srinivas.dynamicprogramming1;

public class MatrixChainMultiplication2 {

    private static void matMul(int[] arr, int n) {
        int dp[][] = new int[n][n];
        int p = 0;
        for (int i = 0; i < n; i++) {
            dp[i][i] = 0;
        }
        for (int l = 2; l < n; l++) {
            for (int i = 1; i < n - l + 1; i++) {
                int j = i + l - 1;
                dp[i][j] = 1000;
                for (int k = 1; k < j; k++) {
                    p = dp[i][k] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j];
                    if (p < dp[i][j]) {
                        dp[i][j] = p;
                    }
                }

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + dp[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 2, 7};
//        int[] arr = {1,2,3,4};
        matMul(arr, arr.length);
    }
}
