package com.srinivas.smartinterview.week4.day1;

public class MaxSubArraySum {
    static int arr[] = {5, -1, 3, 2, -13, 7, 5, -6, 2, 5, -3, 8, 12, -4, 5, 7, 13, -2, 8};

    public static void main(String[] args) {

        int start = 0, end = 0, maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                  //  System.out.print(arr[k] + " ");
                }
                //System.out.println("sum ===== "+sum);
                if (sum >= maxSum) {
                    maxSum = sum;
                    start = i;
                    end = j;
                }
                //System.out.println();
            }
        }

        for (int i = start; i <= end; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println(" Toatl= " + maxSum);
    }
}
