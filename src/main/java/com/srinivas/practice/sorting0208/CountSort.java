package com.srinivas.practice.sorting0208;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 2};

        printSortedOrder(getCounts(arr));
    }

    private static void printSortedOrder(int[] counts) {
        for (int i = 1; i < counts.length; i++) {
            int count = counts[i];
            while (count > 0) {
                System.out.print(i+" ");
                count--;
            }
        }
    }

    private static int[] getCounts(int[] arr) {
        int[] count = new int[8];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }
        return count;
    }
}
