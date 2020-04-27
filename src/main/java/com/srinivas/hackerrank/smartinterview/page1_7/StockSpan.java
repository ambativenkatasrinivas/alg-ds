package com.srinivas.hackerrank.smartinterview.page1_7;

import com.srinivas.common.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StockSpan {

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
            if (top == -1) {
                return 0;
            }
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String line = bufferedReader.readLine();
            String[] elements = line.split(" ");
            int[] arr = new int[elements.length];
            for (int i = 0; i < elements.length; i++) {
                arr[i] = Integer.parseInt(elements[i]);
            }
            stringBuffer.append(stockSpan(arr)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
//        int arr[] = {0, 7, 3, 6, 6, 9, 18, 0, 16, 0};
//        int arr[] = {100,80, 60, 70, 60, 75, 85};
//        stockSpan(arr);
    }

    private static StringBuffer stockSpan(int arr[]) {
        StringBuffer stringBuffer = new StringBuffer();
        Stack stack = new Stack();
        int[] arrB = new int[arr.length];
        stack.push(arr.length - 1);
        for (int i = arr.length - 2; i >= 0; i--) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int element = stack.pop();
                arrB[element] = element - i;
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) {
            int element = stack.pop();
            arrB[element] = element + 1;
        }
        for (int i=0;i<arrB.length;i++){
            stringBuffer.append(arrB[i]).append(" ");
        }
        return stringBuffer;
    }
}
