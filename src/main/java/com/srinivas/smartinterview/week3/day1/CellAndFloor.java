package com.srinivas.smartinterview.week3.day1;

import com.srinivas.common.Util;

import java.util.Arrays;

public class CellAndFloor {
    public static void main(String[] args) {
        int arr[] = {12, 11, 14, 5, 6, 7};
        Arrays.sort(arr);
        Util.print(arr);
        System.out.println(" Floor Value " + binarySearchFloor(arr, 13));
        System.out.println(" Cell Value " + binarySearchCell(arr, 13));
    }

    // It will return Floor value
    public static int binarySearchFloor(int arr[], int k) {
        int ans = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < k) {
                ans = arr[mid];
                low = mid + 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                ans = arr[mid];
                return ans;
            }

        }
        return ans;
    }

    // It will return Cell value
    public static int binarySearchCell(int arr[], int k) {
        int ans = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] > k) {
                ans = arr[mid];
                high = mid - 1;
            } else {
                ans = arr[mid];
                return ans;
            }
        }
        return ans;
    }
}
