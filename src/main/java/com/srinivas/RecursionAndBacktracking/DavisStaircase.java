package com.srinivas.RecursionAndBacktracking;

public class DavisStaircase {
    public static void main(String[] args) {
        int n = 4;
        boolean[] check = new boolean[n];
        int str[] = new int[n];
        generateSquare(n, check, str, 0);
    }

    static void generateSquare(int n, boolean check[], int str[], int index) {
        if (strCount(str) == 5) {
            for (int i = 0; i < index; i++) {
                System.out.print(str[i]);
            }
            System.out.println();
        } else {
            int i = 1;
            while (strCount(str) < 5) {
                    check[i - 1] = true;
                    str[index] = i;
                    generateSquare(n, check, str, index + 1);
                    i = i + 1;
                    check[i - 1] = false;
                }
            }
    }

    static int strCount(int str[]) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            count = count + str[i];
        }
        return count;
    }
}
