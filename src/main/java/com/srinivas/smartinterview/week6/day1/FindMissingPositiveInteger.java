package com.srinivas.smartinterview.week6.day1;

/**
 * Given an array of positive integers and non duplicate elements
 * find first missing positive integer
 * <p>
 * 1 2 3 5 13 17 21 37
 * First missing positive integer 4
 *
 * N, 1
 */
public class FindMissingPositiveInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4, 5, 6, 7, 8, 10};
        int n = arr.length;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                System.out.println("First Missing positive integer: "+ (arr[i] + 1));
                break;
            }
        }
    }
}
