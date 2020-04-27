package com.srinivas.smartinterview.week7.day1;

public class Stack {
    private int top = -1;
    private int arr[] = new int[100];

    public void push(int x) {
        arr[++top] = x;
    }

    public int pop() {
        return arr[top--];
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        stack.push(50);
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
        stack.push(10);
        System.out.println(stack.pop());
    }
}
