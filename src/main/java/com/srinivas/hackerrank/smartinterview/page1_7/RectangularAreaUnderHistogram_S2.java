package com.srinivas.hackerrank.smartinterview.page1_7;

import com.srinivas.common.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Optimized solution need to try with brutefore solution
public class RectangularAreaUnderHistogram_S2 {

    public static class Stack {
        private int top = -1;
        private int arr[] = new int[10000];

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
            if (top == -1) {
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main1(String[] args) {
//        int[] arr = {6, 2, 5, 4, 5, 1, 6};
        int[] arr = {10,10,10,10,1};
        int[] rMin = getRightMinArr(arr);
        int[] lMin = getLeftMinArr(arr);

        Util.print(rMin);
        System.out.println();
        Util.print(lMin);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String inputString = bufferedReader.readLine();
            String[] elements = inputString.split(" ");
            int[] arr = new int[elements.length];
            int index = 0;

            for (String element : elements) {
                arr[index] = Integer.parseInt(element);
                index++;
            }
            stringBuffer.append(rectangularAreaUnderHistogram(arr)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    private static int rectangularAreaUnderHistogram(int arr[]) {
        int result = 0;
        int[] rmin = getRightMinArr(arr);
        int[] lmin = getLeftMinArr(arr);

        for (int i = 0; i < arr.length; i++) {
            result = Math.max(result, (rmin[i] - lmin[i] - 1) * arr[i]);
        }
        return result;
    }

    private static int[] getRightMinArr(int arr[]) {
        Stack stack = new Stack();
        int[] rmin = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int ele = stack.pop();
                rmin[ele] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int ele = stack.pop();
            rmin[ele] = arr.length;
        }
        return rmin;
    }

    private static int[] getLeftMinArr(int arr[]) {
        Stack stack = new Stack();
        int[] lmin = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] < arr[stack.peek()]) {
                int ele = stack.pop();
                lmin[ele] = i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int ele = stack.pop();
            lmin[ele] = -1;
        }
        return lmin;
    }

}
