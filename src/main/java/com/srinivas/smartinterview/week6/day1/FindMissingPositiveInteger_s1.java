package com.srinivas.smartinterview.week6.day1;

/**
 * I don't know how it working
 *
 * Given an array of positive integers and non duplicate elements
 * find first missing positive integer
 * <p>
 * 1 2 3 5 13 17 21 37
 * First missing positive integer 4
 * <p>
 * Log N, 1
 */
public class FindMissingPositiveInteger_s1 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,17,21,37};

        int low = 0, high = arr.length - 1;
        int i = low, j = high;
        int diff = arr[0];
        int floor = 0;
        while (i <= j) {
            int mid = (j + i) / 2;
            if (diff + mid == arr[mid]) {
                floor = mid;
                i = mid + 1;
            } else if (arr[mid] > mid + diff) {
                j = mid - 1;
            }
        }
        System.out.println("Element found at: "+(floor+2));
    }
}
