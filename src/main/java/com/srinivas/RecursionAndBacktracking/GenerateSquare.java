package com.srinivas.RecursionAndBacktracking;

public class GenerateSquare {
    public static void main(String[] args) {
        int n = 9;
        boolean[] check = new boolean[n];
        int str[] = new int[n];
        generateSquare(n, check, str, 0);
    }

    static void generateSquare(int n, boolean check[], int str[], int index) {
        if (index == n) {
            for (int i = 0; i < index; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (!check[i - 1]) {
                check[i - 1] = true;
                str[index] = i;
                generateSquare(n, check, str, index + 1);
                check[i - 1] = false;
            }
        }
    }
}
