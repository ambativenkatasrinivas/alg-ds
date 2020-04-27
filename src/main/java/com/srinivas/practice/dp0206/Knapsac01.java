package com.srinivas.practice.dp0206;

public class Knapsac01 {
    private static int knapsac01(int[] p, int[] w, int m, int n) {
        int[][] v = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (j - w[i-1] >= 0) {
                    v[i][j] = Math.max(v[i - 1][j], v[i - 1][j - w[i-1]] + p[i-1]);
                } else {
                    v[i][j] = v[i - 1][j];
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                System.out.print(" " + v[i][j]);
            }
            System.out.println();
        }

        return v[n][m];
    }

    public static void main(String[] args) {
        //Case 1:
//        int[] p = {1, 2, 5, 6};
//        int[] w = {2, 3, 4, 5};
//        int m = 8;
//        int n = 4;

        //Case 2:
        int[] p = {60, 100, 120};
        int[] w = {10, 20, 30};
        int m = 50;
        int n = 3;

        System.out.println(knapsac01(p, w, m, n));
    }
}
