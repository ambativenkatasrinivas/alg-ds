package com.srinivas.dynamicprogramming1;

public class MatrixChainMultiplication {

    private static void matrixChainMultiplication(int[] input) {
        int[][] dp = new int[input.length][input.length];
        for (int i = 0; i < dp.length - 1; i++) {
            for (int j = 0; j < dp[0].length - 1; j++) {
                if (i == j) {
                    dp[i][j] = 0;
                }
                if (i < j) {
                    dp[i][j] = input[i] * input[j] * input[j + 1];
                }
            }
        }

        for (int i = 0; i < dp.length - 1; i++) {
            for (int j = 0; j < dp[0].length - 1; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int input[] = {20, 2, 30, 12, 8};
        matrixChainMultiplication(input);
    }
}
