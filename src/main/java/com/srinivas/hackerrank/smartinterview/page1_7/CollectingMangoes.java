package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollectingMangoes {

    public static class Stack {
        private int top = -1;
        private int arr[] = new int[100000];

        public void push(int x) {
            arr[++top] = x;
        }

        public int pop() {
            if (top == -1) {
                return -2;
            }
            return arr[top--];
        }

        public int peek() {
            if (top == -1) {
                return -1;
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
        int caseCount = 1;
        StringBuffer ouputBuffer = new StringBuffer();
        while (t > 0) {
            Stack stack = new Stack();
            Stack maxStack = new Stack();
            int n = Integer.parseInt(bufferedReader.readLine());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Case ").append(caseCount++).append(":").append("\n");
            while (n > 0) {
                String input = bufferedReader.readLine();
                int temp = collectingMangoes(input, stack, maxStack);
                if (temp == -1) {
                    stringBuffer.append("Empty").append("\n");
                } else if (temp != -2 ) {
                    stringBuffer.append(temp).append("\n");
                }
                n--;
            }
            ouputBuffer.append(stringBuffer.subSequence(0,stringBuffer.length()-2)).append("\n");
            t--;
        }
        System.out.println(ouputBuffer.substring(0, ouputBuffer.length()-2));
    }



    private static int collectingMangoes(String input, Stack stack, Stack maxStack) {
        String elements[] = input.split(" ");
        if (elements[0].equals("A")) {
            stack.push(Integer.parseInt(elements[1]));
            if (maxStack.isEmpty()) {
                maxStack.push(Integer.parseInt(elements[1]));
            } else if (maxStack.peek() <= Integer.parseInt(elements[1])) {
                maxStack.push(Integer.parseInt(elements[1]));
            } else if (maxStack.peek() > Integer.parseInt(elements[1])) {
                maxStack.push(maxStack.peek());
            }
        } else if (elements[0].equals("R")) {
            stack.pop();
            maxStack.pop();
        } else {
            return maxStack.peek();
        }
        return -2;
    }

}
