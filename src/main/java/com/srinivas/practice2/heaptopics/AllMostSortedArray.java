package com.srinivas.practice2.heaptopics;

public class AllMostSortedArray {

    public static void main(String[] args) {
//        int arr[] = {10, 9, 8, 7, 4, 70, 60, 50};
        int arr[] = {50,60,70,4,7,8,9,10};
        int sortedArr[] = new int[arr.length];
        int k = 4;
        MaxHeap maxHeap = new MaxHeap(100);
        for (int i = 0; i < k; i++) {
            maxHeap.insert(arr[i]);
        }
        int x = 0;
        for (int i = k; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
            sortedArr[x++] = maxHeap.getMax();
            maxHeap.delete();
        }

        while (!maxHeap.isEmpty()) {
            sortedArr[x++] = maxHeap.getMax();
            maxHeap.delete();
        }

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(" "+sortedArr[i]);
        }
    }
}
