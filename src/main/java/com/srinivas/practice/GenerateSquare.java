package com.srinivas.practice;

public class GenerateSquare {
    public static void main(String[] args) {
        int s[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        System.out.println(formingMagicSquare(s));
    }

    static int formingMagicSquare(int[][] s) {
        int t[] = new int[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[count++] = s[i][j];
            }
        }

        int n = 9;
        boolean[] check = new boolean[n];
        int str[] = new int[n];
        generateSquare(n, check, str, 0, t);
        return minDiff;
    }

    static int minDiff = 100;

    static void generateSquare(int n, boolean check[], int str[], int index, int s[]) {
        if (index == n) {
            if (checkSqure(str)) {
                int diff = findDiff(str, s);
                if (diff < minDiff) {
                    minDiff = diff;
                }
                for (int i = 0; i < str.length; i++) {
                    System.out.print(str[i]);
                }
                System.out.println();
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!check[i - 1]) {
                check[i - 1] = true;
                str[index] = i;
                generateSquare(n, check, str, index + 1, s);
                check[i - 1] = false;
            }
        }
    }

    static boolean checkSqure(int str[]) {
        return str[0] + str[1] + str[2] == 15 && str[3] + str[4] + str[5] == 15 && str[6] + str[7] + str[8] == 15 && str[0] + str[4] + str[8] == 15 &&
                str[2] + str[4] + str[6] == 15 && str[0] + str[3] + str[6] == 15 && str[1] + str[4] + str[7] == 15 && str[2] + str[5] + str[8] == 15;
    }

    static int findDiff(int str[], int ip[]) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] > ip[i]) {
                count = count + (str[i] - ip[i]);
            } else if (str[i] < ip[i]) {
                count = count + (ip[i] - str[i]);
            }
        }
        return count;
    }
}
