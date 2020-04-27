package com.srinivas.revision1;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 2, 7, 5, 2};
        int[] count = new int[8];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i]] + 1;
        }

        for (int i = 0; i < count.length; i++) {
            int temp = count[i];
            while (temp > 0) {
                System.out.print(" "+i);
                temp--;
            }
        }
    }
}
