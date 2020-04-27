package com.srinivas.practice.backtracking.BT_12_16;

public class ComdinationsOfParathasis {
    private static void generate(int n, int idx, char arr[], int oc, int cc) {
        if (idx == n) {
            System.out.println(new String(arr));
        }
        if (oc < n/2) {
            arr[idx] = '{';
            generate(n, idx+1, arr, oc+1, cc);
        }
        if (cc < oc) {
            arr[idx] = '}';
            generate(n, idx+1, arr, oc,cc+1);
        }
    }

    public static void main(String[] args) {
        generate(6, 0,new char[6], 0, 0);
    }
}