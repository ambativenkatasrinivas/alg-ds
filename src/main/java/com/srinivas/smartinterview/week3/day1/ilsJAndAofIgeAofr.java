package com.srinivas.smartinterview.week3.day1;

// i<j and arr[i]>arr[j]
public class ilsJAndAofIgeAofr {
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i < j && arr[i] > arr[j]) {
                    count++;
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        System.out.println("count= "+count);
    }
}
