package com.srinivas.RecursionAndBacktracking;

public class GenerateSquare2 {
    public static void main(String[] args) {
        int n = 5;
        boolean[] check = new boolean[n];
        int str[] = new int[n+2];
        generateSquare(n, check, str, 0);
    }

    static void generateSquare(int n, boolean check[], int str[], int index) {
        if (strCount(str, n) == 5) {
       // if (index == n) {
          if (str[0] !=0 && str[1] !=0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(" " + str[i]);
                }
                System.out.println();
          }
        }
        for (int i = 0; i < n; i++) {
            str[index] = i;
            if (index < n)
            generateSquare(n, check, str, index + 1);
        }
    }

    static int strCount(int str[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            count = count + str[i];

        }
        return count;
    }
}
