package com.srinivas.practice.backtracking.BT_12_16;

public class BinarySequence {
    private static void rrr(int n, int idx, char arr[]) {
        int s = 549;
        if (idx == n) {
            System.out.println(new String(arr));
        }
        if (idx < n) {
            arr[idx] = '0';
            rrr(n, idx + 1, arr);
            arr[idx] = '1';
            rrr(n, idx + 1, arr);
        }
    }
    public static void main(String[] args) {
        rrr(100, 0, new char[100]);
    }
}
