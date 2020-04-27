package com.srinivas.smartinterview.week7.day1;

import com.srinivas.common.Util;

public class FirstSmallestRightElement {

    public static void main(String[] args) {
        int arrA[] = {2, 7, 4, 6, 5, 9, 13, 8, 17, 2};
        int arrB[] = new int[arrA.length];
        Stack stack = new Stack();
        for (int index = 0; index < arrA.length; index++) {
            while (!stack.isEmpty() && arrA[stack.peek()] > arrA[index]) {
                arrB[stack.peek()] = arrA[index];
                stack.pop();
            }
            stack.push(index);
        }

        while (!stack.isEmpty()) {
            arrB[stack.peek()] = 10000;
            stack.pop();
        }

        Util.print(arrB);
//        for (int i=0;i<arrA.length;i++) {
//             if (stack.peek() > arrA[i]) {
//
//             }
//
//             stack.push(arrA[i]);
//         }

    }
}
