package com.srinivas.smartinterview.week4.day1;

public class MaxSubArraySum2 {
    static int arr[] = {5, -1, 3, 2, -13, 7, 5, -6, 2, 5, -3, 8, 12, -4, 5, 7, 13, -2, 8};

    public static void main(String[] args) {

        int maxSum = Integer.MIN_VALUE, start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum > maxSum) {
                    start = i;
                    end = j;
                    maxSum = sum;
                }
            }
        }

        for (int i=start;i<=end;i++) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Totalt= "+maxSum);

    }
}
