package com.srinivas.hackerrank.smartinterview.page1_7;

import com.srinivas.common.Util;
import com.sun.imageio.plugins.common.I18N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

// Optimized solution need to try with brutefore solution
public class RectangularAreaUnderHistogram_S1 {

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
        for (int i = 0; i < arr.length; i++) {
            // Right minimum
            int rmin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] >= arr[i]) {
                    rmin = j;
                } else {
                    break;
                }
            }
            // Left minimum
            int lmin = i;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= arr[i]) {
                    lmin = j;
                } else {
                    break;
                }
            }
            result = Math.max(result, (rmin - lmin + 1) * arr[i]);
        }
        return result;
    }

//    private static int[] getRightArr(int arr[]) {
//        int rightArr[] = new int[arr.length];
//        Stack stack = new Stack();
//        for (int index = 0; index < arr.length; index++) {
//            while (!stack.isEmpty() && arr[stack.peek()] > arr[index]) {
//                rightArr[stack.peek()] = arr[index];
//                stack.pop();
//            }
//            stack.push(index);
//        }
//        while (!stack.isEmpty()) {
//            rightArr[stack.peek()] = arr.length;
//            stack.pop();
//        }
//        return rightArr;
//    }
}
