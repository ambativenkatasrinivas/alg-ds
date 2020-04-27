package com.srinivas.smartinterview.week3.day1;

import com.srinivas.common.Util;

import java.util.Arrays;

public class FindFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 2, 2, 2, 2, 8, 2, 2, 8, 15, 15, 4, 4, 4, 4, 4, -1, -1, -1};
        Arrays.sort(arr);
        Util.print(arr);
        System.out.println(findFrequencyStarting(arr, 2));
        System.out.println(findFrequencyEnding(arr, 2));
    }

    public static int findFrequencyEnding(int[] arr, int k) {
        int ans = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] == k) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int findFrequencyStarting(int[] arr, int k) {
        int ans = 0;
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[mid] < k) {
                low = mid + 1;
            } else if (arr[mid] == k) {
                ans = mid;
                high = mid - 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}

