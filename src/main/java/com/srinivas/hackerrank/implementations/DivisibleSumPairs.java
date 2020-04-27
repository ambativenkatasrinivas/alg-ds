package com.srinivas.hackerrank.implementations;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        int ar[] = {1, 3, 2, 6, 1, 2};
        System.out.println(divisibleSumPairs(0, 3, ar));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {
        for (int x=0;x<ar.length;x++){
            System.out.print(" "+x);
        }
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
