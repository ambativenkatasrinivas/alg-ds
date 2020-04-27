package com.srinivas.smartinterview.week3.day1;

import com.srinivas.common.Util;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        Arrays.sort(arr);
        Util.print(arr);

        binarySearch(arr, 11);
    }

    public static void binarySearch(int arr[], int s) {
        int low = 0, high = arr.length-1;
        int mid = 0;

        while (low <= high) {
            mid = ((high+low)/2);
            if (arr[mid] < s){
                low = mid+1;
            } else if (arr[mid] > s) {
                high = mid-1;
             } else {
                System.out.println("position= "+ (mid+1));
                return;
            }
        }

    }

}
