package com.srinivas.RecursionAndBacktracking;

public class CommonSubsequence {
    static char arr[] = new char[11];
    static int idx = 0;

    private static int largestCmmnSubSeq(char str[], char str1[], int i, int j) {
        if (i < str.length && j < str1.length) {
            if (str[i] == str1[j]) {
                arr[idx++] = str[i];
                return 1 + largestCmmnSubSeq(str, str1, i + 1, j + 1);
            }
//            int value1 = largestCmmnSubSeq(str, str1, i + 1, j, idx + 1);
//            int value2 = largestCmmnSubSeq(str, str1, i, j + 1, idx + 1);
//
//            if (value1 > value2) {
//                return value1;
//            } else {
//                return value2;
//            }
            return Math.max(largestCmmnSubSeq(str, str1, i + 1, j), largestCmmnSubSeq(str, str1, i, j + 1));
        }
        return 0;
    }

    public static void main(String[] args) {
//        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'h'};
//        char[] str1 = {'a', 'b', 'c', 'd', 'e', 'f', 'h'};

//        char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'h'};
//        char[] str1 = {'a', 'b', 'd', 'g', 'e', 'f', 'h'};

//        char[] str = {'A', 'B', 'C', 'D', 'G', 'H'};
//        char[] str1 = {'A', 'E', 'D', 'F', 'H', 'R'};

        char[] str = {'A', 'G', 'G', 'T', 'A', 'B'};
        char[] str1 = {'G', 'X', 'T', 'X', 'A', 'Y', 'B'};

        System.out.println(largestCmmnSubSeq(str, str1, 0, 0));

        int x = 0;
        while (x < arr.length) {
            System.out.print(" " + arr[x]);
            x++;
        }
    }
}
