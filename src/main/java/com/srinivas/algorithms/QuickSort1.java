package com.srinivas.algorithms;

public class QuickSort1 {

    static int  arr[] = {25, 10, 35, 5, 45, 50, 55, 60, 70, 20};

    public static void main(String args[]) {
        partion(0, arr.length-1);
        for (int x = 0; x < arr.length; x++) {
            System.out.print(" "+arr[x]);
        }
    }

    public  static void partion(int low, int high) {
        int i = low;
        int j = high;
        int pivot = (low + (high - low) / 2);

        while (i < j) {
            while (arr[i] < arr[pivot]) {
                i++;
            }

            while (arr[j] > arr[pivot]) {
                j--;
            }

            if (i <= j) {
                swap(i, j);
                i++;
                j--;
            }

            if (low < j) {
                partion(low, j);
            }
            if (i < high) {
                partion(i, high);
            }
        }


    }

    public static void swap(int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
