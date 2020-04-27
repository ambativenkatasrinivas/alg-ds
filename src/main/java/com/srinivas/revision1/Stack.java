package com.srinivas.revision1;

public class Stack {
    public int[] stack;
    public int top;

    public Stack() {
        stack = new int[10];
        top = -1;
    }

    public void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
        }
    }

    public int pop() {
        int x = -1;
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            x = stack[top--];
        }
        return x;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
    }
}
