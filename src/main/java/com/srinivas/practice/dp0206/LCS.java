package com.srinivas.practice.dp0206;

public class LCS {

    private static int lcs(char[] str1, char[] str2, int i, int j) {

        if (str1.length <= i || str2.length <= j) {
            return 0;
        }

        if (str1[i] == str2[j]) {
            return 1 + lcs(str1, str2, i + 1, j + 1);
        } else {
            return Math.max(lcs(str1, str2, i + 1, j), lcs(str1, str2, i, j + 1));
        }
    }

    public static void main(String[] args) {
        char[] str1 = {'A', 'B', 'C', 'D', 'G', 'H', 'Z'};
        char[] str2 = {'A', 'E', 'D', 'F', 'H', 'R', 'Z'};
        System.out.println(lcs(str1, str2, 0, 0));
    }
}
