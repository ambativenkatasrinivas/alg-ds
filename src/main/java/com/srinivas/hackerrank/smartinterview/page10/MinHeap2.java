package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Using array
public class MinHeap2 {

    static class MinHeap {
        int heap[];
        int lastIndex = 0;

        public MinHeap() {
            heap = new int[10000000];
        }

        public void insert(int data) {
            heap[++lastIndex] = data;
            int curr = lastIndex;
            while (curr > 1 && heap[curr/2] > heap[curr]) {
                swap(curr/2, curr);
                curr = curr / 2;
            }
        }

        public void deleteMin(int i) {
            if (i < lastIndex) {
                if (lastIndex == 1) {
                    heap[lastIndex--] = 0;
                } else {
                    heap[1] = heap[lastIndex--];
                    heap[lastIndex+1] = 0;
                    heapify(1);
                }
            }
        }

        private void heapify(int i) {
            int left = i * 2;
            int right = i * 2 + 1;
            int smallest = i;

            if (left < lastIndex && heap[smallest] > heap[left]) {
                smallest = left;
            }
            if (right < lastIndex && heap[smallest] > heap[right]) {
                smallest = right;
            }

            if (i != smallest) {
                swap(i, smallest);
                heapify(smallest);
            }

        }

        public String getMin() {
            if (lastIndex > 0) {
                return heap[1] + "";
            }
            return "Empty";
        }

        private void swap(int sour, int dest) {
            int temp = heap[sour];
            heap[sour] = heap[dest];
            heap[dest] = temp;
        }

    }

    public static void main(String[] args) throws IOException {
        MinHeap minHeap = new MinHeap();
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String[] input = bufferedReader.readLine().split(" ");
            if (input[0].equals("insert")) {
                minHeap.insert(Integer.parseInt(input[1]));
            }
            if (input[0].equals("delMin")) {
                minHeap.deleteMin(0);
            }
            if (input[0].equals("getMin")) {
                stringBuffer.append(minHeap.getMin()).append("\n");
            }
            t--;
        }
        System.out.println(stringBuffer);
    }

}
