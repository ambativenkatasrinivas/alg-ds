package com.srinivas.linkedlists;

import java.util.Stack;

public class LinkedList {

    private Node head;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void insert(int data) {
        Node temp = head;
        if (head == null) {
            head = new Node(data);
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }
    }

    public int length() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void delete(int pos) {
        Node temp = head;
        if (pos <= length()) {
            if (pos == 1) {
                head = head.next;
            } else {
                while (pos > 2) {
                    pos--;
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public void findMid() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public void createCycle() {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node temp2 = head.next.next.next.next;
        temp.next = temp2;
    }

    public void deleteCycle() {
        Node slow = head;
        Node fast = head.next;
        while (slow.data != fast.data) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("slow.data " + slow.data + " fast.data " + fast.data);
        Node temp = head;
        while (temp.data != slow.next.data) {
            temp = temp.next;
            slow = slow.next;
        }
        slow.next = null;
    }

    public void printReverse() {
        Stack stack = new Stack();
        Node temp = head;
        while (temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);
        ll.print();
        ll.delete(3);
        System.out.println();
        ll.print();
        ll.delete(4);
        System.out.println();
        ll.print();
        ll.delete(1);
        System.out.println();
        ll.print();
        ll.insert(30);
        System.out.println();
        ll.print();
        ll.delete(2);
        System.out.println();
        ll.print();
        System.out.println("print reverse");
        ll.insert(40);
        ll.insert(50);
        ll.printReverse();
        System.out.println();
        ll.print();
        System.out.println();
        System.out.println("----- Mid -----");
        ll.findMid();
        ll.insert(60);
        ll.print();
        System.out.println();
        ll.findMid();
        ll.insert(70);
        ll.insert(80);
        ll.insert(90);
        ll.insert(100);
        ll.insert(110);
        ll.print();
        // Don't uncomment
        ll.createCycle();
//        ll.print();
        ll.deleteCycle();
        ll.print();

    }
}
