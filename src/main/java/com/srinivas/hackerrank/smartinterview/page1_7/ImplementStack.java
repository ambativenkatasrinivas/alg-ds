package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ImplementStack {

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
        int t = Integer.parseInt(bufferedReader.readLine());
        Stack stack = new Stack();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(" ");
        while (t > 0) {
            String input = bufferedReader.readLine();
            String[] elements = input.split(" ");
            if (elements[0].equals("push")) {
                stack.push(Integer.parseInt(elements[1]));
            } else if (elements[0].equals("pop")) {
                int temp = stack.pop();
                if (temp == -1) {
                    stringBuffer.append("Empty").append("\n");
                } else {
                    stringBuffer.append(temp).append("\n");
                }
            }
            t--;
        }
        System.out.println(stringBuffer.substring(1,stringBuffer.length()-1));
    }
}
