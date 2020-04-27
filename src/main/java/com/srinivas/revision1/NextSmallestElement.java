package com.srinivas.revision1;

import java.util.HashMap;
import java.util.Map;

public class NextSmallestElement {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Map<Integer, Integer> map = new HashMap<>();
//        int arr[] = {15, 20, 5, 10, 35, 50, 45, 60};
        int arr[] = {2, 7, 4, 6, 5, 9, 13, 8, 17, 2};
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() > arr[i]) {
                map.put(stack.peek(), arr[i]);
                stack.pop();
            }
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            map.put(stack.peek(), -1);
            stack.pop();
        }

        for (Integer i : map.keySet()) {
            System.out.println(i + " -> " + map.get(i));
        }
    }
}
