package com.srinivas.practice.backtracking;

public class GenerateSquare2 {

    private static void generate(int n, int idx, int[] arr, boolean[] isPresent) {

        if (n == idx) {
            if (validateMagicSquare(arr)) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
            }
        }

        for (int i = 1; i <= n; i++) {
            if (idx < n && !isPresent[i]) {
                arr[idx] = i;
                isPresent[i] = true;
                generate(n, idx + 1, arr, isPresent);
                isPresent[i] = false;
            }
        }

    }

    public static void main(String[] args) {
        generate(9, 0, new int[10], new boolean[10]);
    }

    private static boolean validateMagicSquare(int str[]) {
        return (str[0] + str[1] + str[2] == 15 && str[3] + str[4] + str[5] == 15 && str[6] + str[7] + str[8] == 15
                && str[0] + str[4] + str[8] == 15 && str[2] + str[4] + str[6] == 15&& str[0] + str[3] + str[6] == 15
                && str[1] + str[4] + str[7] == 15&& str[2] + str[5] + str[8] == 15
        );
    }


}
