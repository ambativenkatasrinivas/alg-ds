package com.srinivas.algorithms;

public class NextLargeElement {
    public static void main(String args[]) {
        int[] arr = {15,12,19,20,11};
        NextLargeElement nextLargeElement = new NextLargeElement();
        nextLargeElement.nle(arr);
    }

    private void nle(int arr[]) {
        for (int i=0;i<arr.length;i++) {
            int next = -1;
            for (int j=i+1;j<arr.length;j++) {
                if (arr[j] > arr[i]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" ->"+next);
        }
    }
}
