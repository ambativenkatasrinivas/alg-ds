package com.srinivas.smartinterview.week7.day1;

import jdk.nashorn.internal.ir.IdentNode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MaximumElement {
    public static class Stack {
        private int top = -1;
        private int arr[] = new int[100000];

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
             int temp = arr[top];
             top--;
            return temp;
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
        int n = Integer.parseInt(bufferedReader.readLine());
        while (n > 0) {
            String input = bufferedReader.readLine();
            int res = maximumElement(input);
            if (res != -1)
            stringBuffer.append(res).append("\n");
            n--;
        }
        System.out.println(stringBuffer);
    }
  static   Stack stack = new Stack();
    static Stack maxStack = new Stack();

    private static int maximumElement(String input) {
        String elements[] = input.split(" ");
        if (elements[0].equals("1")) {
            stack.push(Integer.parseInt(elements[1]));
            if (maxStack.isEmpty()) {
                maxStack.push(Integer.parseInt(elements[1]));
            } else if (maxStack.peek() <= Integer.parseInt(elements[1])) {
                maxStack.push(Integer.parseInt(elements[1]));
            } else if (maxStack.peek() > Integer.parseInt(elements[1])){
                maxStack.push(maxStack.peek());
            }
        } else if (elements [0].equals("2")) {
            stack.pop();
            maxStack.pop();
        } else {
            return maxStack.peek();
        }
        return -1;
    }
}