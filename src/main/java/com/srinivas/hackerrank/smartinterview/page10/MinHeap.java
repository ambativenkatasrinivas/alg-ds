package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinHeap {
    private int[] Heap;
    private int size;
    private int maxsize;

    private static final int FRONT = 1;

    public MinHeap(int maxsize)
    {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos)
    {
        return pos / 2;
    }

    private int leftChild(int pos)
    {
        return (2 * pos);
    }

    private int rightChild(int pos)
    {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos)
    {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos)
    {
        int tmp;
        tmp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = tmp;
    }

    private void minHeapify(int pos)
    {

        if (!isLeaf(pos)) {
            if (Heap[pos] > Heap[leftChild(pos)]
                    || Heap[pos] > Heap[rightChild(pos)]) {
                if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }
                else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    public void insert(int element)
    {
        if (size >= maxsize) {
            return;
        }
        Heap[++size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public String getMin() {
        if (size >= 0) {
            return Heap[1] + "";
        }
        return "Empty";
    }
    // Function to print the contents of the heap
    public void print()
    {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" PARENT : " + Heap[i]
                    + " LEFT CHILD : " + Heap[2 * i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
    }

    // Function to build the min heap using
    // the minHeapify
    public void minHeap()
    {
        for (int pos = (size / 2); pos >= 1; pos--) {
            minHeapify(pos);
        }
    }

    // Function to remove and return the minimum
    // element from the heap
    public int remove()
    {
        if (size >=0 ) {
            int popped = Heap[FRONT];
            Heap[FRONT] = Heap[size--];
            minHeapify(FRONT);
            return popped;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        MinHeap minHeap = new MinHeap(10000000);
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String[] input = bufferedReader.readLine().split(" ");
            if (input[0].equals("insert")) {
                minHeap.insert(Integer.parseInt(input[1]));
            }
            if (input[0].equals("delMin")) {
                minHeap.remove();
            }
            if (input[0].equals("getMin")) {
                stringBuffer.append(minHeap.getMin()).append("\n");
            }
            t--;
        }
        System.out.println(stringBuffer);
    }
}
