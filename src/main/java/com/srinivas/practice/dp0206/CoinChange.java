package com.srinivas.practice.dp0206;

public class CoinChange {

    private static int coinChange(int[] s, int n) {
        int[][] table = new int[s.length + 1][n + 1];
        for (int i = 0; i <= s.length; i++) {
            for (int j = 0; j <= n; j++) {
                if (j == 0) {
                    table[i][j] = 1;
                }
            }
        }
        for (int i = 1; i <= s.length; i++) {
            for (int j = 1; j <= n; j++) {
                if (j < s[i-1]) {
                    table[i][j] = table[i - 1][j];
                } else {
                    table[i][j] = table[i - 1][j] + table[i][j - s[i-1]];
                }
            }
        }

        for (int i = 0; i <= s.length; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print(" " + table[i][j]);
            }
            System.out.println();
        }
        return table[s.length][n];
    }

    public static void main(String[] args) {
        int[] s = {2, 5, 3, 6};
        int n = 10;
        System.out.println(coinChange(s, n));
    }
}
