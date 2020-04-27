package com.srinivas.revision1;

// Find pair of elements whose sum is K
public class SumEqualsToK {

    public static void main(String[] args) {
        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int k = 45;
        for (int i = 0; i < arr.length; i++) {
            int idx2 = search(arr, k - arr[i]);
            if (idx2 > 0) {
                System.out.println("K= " + k + " element1= " + arr[i] + " element2= " + arr[idx2]);
            }
        }
    }

    public static int search(int[] arr, int key) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return -1;
    }
}
