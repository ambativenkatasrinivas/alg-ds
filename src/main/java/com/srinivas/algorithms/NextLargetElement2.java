package com.srinivas.algorithms;

import java.util.Stack;

public class NextLargetElement2 {

    public static void main(String args[]) {
        int[] arr = {15, 12, 19, 20, 11, 30, 40, 50,5};
        NextLargetElement2 nextLargeElement2 = new NextLargetElement2();
        nextLargeElement2.nle(arr);
    }

    private void nle(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int element;
        int next;
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            next = arr[i];
            if (!stack.isEmpty()) {
                element = stack.pop();
                while(element < next) {
                    System.out.println(element+" -> "+next);
                    if (stack.isEmpty())
                        break;
                    element = stack.pop();
                }
                if (element > next)
                stack.push(element);
            }
            stack.push(next);
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop()+" -> -1");
        }
    }
}
