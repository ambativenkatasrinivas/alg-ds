package com.srinivas.practice.backtracking.BT_12_16;

public class MagicSquare {
    private static void magicSquare(int n, int idx, int arr[], boolean isDuplicate[]) {
        if (idx == n) {
//            if (isValid(arr)) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
//            }
        }
        for (int i = 1; i <= n; i++) {
            if (!isDuplicate[i]) {
                arr[idx] = i;
                isDuplicate[i] = true;
                magicSquare(n, idx + 1, arr, isDuplicate);
                isDuplicate[i] = false;
            }
        }
    }

    private static boolean isValid(int[] arr) {
        return arr[0] + arr[1] + arr[2] == 15 && arr[3] + arr[4] + arr[5] == 15 /*&& arr[6] + arr[7] + arr[8] == 15&& arr[0] + arr[3] + arr[6] == 15*/
                && arr[1] + arr[4] + arr[7] == 15 && arr[2] + arr[5] + arr[8] == 15
                && arr[0] + arr[4] + arr[8] == 15 && arr[2] + arr[4] + arr[6] == 15;

    }

    public static void main(String[] args) {
        magicSquare(9, 0, new int[9], new boolean[9 + 1]);
    }
}
