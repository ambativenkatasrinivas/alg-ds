package com.srinivas.algorithms;

import java.util.Stack;

public class NextLargetElement3 {

    public static void main(String args[]) {
        int[] arr = {15, 12, 19, 20, 11, 30, 40, 50,5};
        NextLargetElement3 nextLargeElement3 = new NextLargetElement3();
        nextLargeElement3.pirntNGE(arr);
    }

    private void pirntNGE(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int[] nge = new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() < arr[i]) {
                    stack.pop();
                }
            }
            nge[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" -> "+nge[i]);
    }

}
