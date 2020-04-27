package com.srinivas.dynamicprogramming1;

public class MaxSubSeqSum {

    public static void main(String[] args) {
//        int arr[] = {5, 5, 10, 100, 10, 5};
//        int arr[] = {1,2,3};
        int arr[] = {1, 20, 3};
        maxSubSeqSum(arr);
    }

    private static void maxSubSeqSum(int[] arr) {
        int[] subSeq = new int[arr.length];
        subSeq[0] = max(arr[0], 0);
        subSeq[1] = max(arr[0],arr[1]);
        for (int i=2;i<arr.length;i++) {
            subSeq[i] = max(subSeq[i-1], subSeq[i-2]+arr[i]);
        }

        int maxSum = 0;
        int position = -1;
        for (int i=0;i<arr.length;i++) {
            if (subSeq[i] > maxSum){
                position = i;
                maxSum = subSeq[i];
            }
        }
        System.out.println("Max sum= "+maxSum);
//        for (int i=position;i>=0;i--){
//            if (maxSum <=0){
//                break;
//            }
//            System.out.print(" "+arr[i]);
//            maxSum = maxSum - arr[i];
//        }
    }

    private static int max(int a, int b) {
        if (a > b){
            if (a<0) {
                return 0;
            }
            return a;
        } else {
            if (b<0){
                return 0;
            }
            return b;
        }
    }

}
