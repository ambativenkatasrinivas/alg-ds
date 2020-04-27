package com.srinivas.smartinterview.week7.day1;

import com.sun.imageio.plugins.common.I18N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseTheSentence {
    public static class Stack {
        private int top = -1;
        private String arr[] = new String[100];

        public void push(String x) {
            arr[++top] = x;
        }

        public String pop() {
            return arr[top--];
        }

        public String peek() {
            return arr[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (n > 0) {
            stringBuffer.append(reverseTheSentence(bufferedReader.readLine())).append("\n");
            n--;
        }
        System.out.println(stringBuffer);
    }

    private static StringBuffer reverseTheSentence(String string) {
        Stack stack = new Stack();
        StringBuffer stringBuffer = new StringBuffer();
        String[] strings = string.split(" ");
        for (String s : strings) {
            stack.push(s);
        }

        while (!stack.isEmpty()) {
            stringBuffer.append(stack.pop()).append(" ");
        }
        return stringBuffer;
    }
}
