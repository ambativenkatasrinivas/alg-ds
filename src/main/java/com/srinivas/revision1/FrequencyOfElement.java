package com.srinivas.revision1;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 10, 10, 20, 20, 20, 20};
        int key = 20;
//        int key = 10;
//        int key = 5;
//        int key = 100;
        System.out.println("Lower index= " + lowerIdx(arr, key));
        System.out.println("Higher index= " + higherIdx(arr, key));
        System.out.println("total count of " + key + " = " + (higherIdx(arr, key) - lowerIdx(arr, key) + 1));
    }

    public static int lowerIdx(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        int lower = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                lower = mid;
                j = mid - 1;
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return lower;
    }

    public static int higherIdx(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        int higher = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                higher = mid;
                i = mid + 1;
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return higher;
    }
}
