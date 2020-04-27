package com.srinivas.practice.heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllTimeMedian {

    class MaxHeap {
        private int lastIndex;
        private int[] heap;

        public MaxHeap() {
            lastIndex = 0;
            heap = new int[100];
        }

        public void insert(int data) {
            heap[++lastIndex] = data;
            int cur = lastIndex;
            while (cur > 1 && heap[cur] > heap[cur / 2]) {
                swap(cur, cur / 2);
                cur = cur / 2;
            }
        }

        public int deleteMax(int i) {
            int deletedValue = heap[1];
            if (lastIndex > i) {
                if (lastIndex == 1) {
                    heap[lastIndex--] = 0;
                } else {
                    heap[1] = heap[lastIndex--];
                    heapify(1);
                }
            }
            return deletedValue;
        }

        private void heapify(int i) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int smallest = i;
            if (left <= lastIndex && heap[smallest] < heap[left]) {
                smallest = left;
            }
            if (right <= lastIndex && heap[smallest] < heap[right]) {
                smallest = right;
            }
            if (i != smallest) {
                swap(i, smallest);
                heapify(smallest);
            }
        }

        public int getMax() {
            if (lastIndex > 0) {
                return heap[1];
            }
            return -1;
        }

        private void swap(int s, int t) {
            int temp = heap[s];
            heap[s] = heap[t];
            heap[t] = temp;
        }

        public int size() {
            return lastIndex;
        }
    }

    class MinHeap {
        private int lastIndex;
        private int[] heap;

        public MinHeap() {
            lastIndex = 0;
            heap = new int[100];
        }

        public void insert(int data) {
            heap[++lastIndex] = data;
            int cur = lastIndex;
            while (cur > 1 && heap[cur] < heap[cur / 2]) {
                swap(cur, cur / 2);
                cur = cur / 2;
            }
        }

        public int deleteMin(int i) {
            int deletedValue = heap[1];
            if (lastIndex > i) {
                if (lastIndex == 1) {
                    heap[lastIndex--] = 0;
                } else {
                    heap[1] = heap[lastIndex--];
                    heapify(1);
                }
            }
            return deletedValue;
        }

        public int size() {
            return lastIndex;
        }

        private void heapify(int i) {
            int left = 2 * i;
            int right = 2 * i + 1;
            int smallest = i;
            if (left <= lastIndex && heap[smallest] > heap[left]) {
                smallest = left;
            }
            if (right <= lastIndex && heap[smallest] > heap[right]) {
                smallest = right;
            }
            if (i != smallest) {
                swap(i, smallest);
                heapify(smallest);
            }
        }

        public int getMin() {
            if (lastIndex > 0) {
                return heap[1];
            }
            return -1;
        }

        private void swap(int s, int t) {
            int temp = heap[s];
            heap[s] = heap[t];
            heap[t] = temp;
        }
    }

    private MinHeap minHeap;
    private MaxHeap maxHeap;

    public AllTimeMedian() {
        this.minHeap = new MinHeap();
        this.maxHeap = new MaxHeap();
    }

    private int processData(int data) {
        maxHeap.insert(data);
        if (maxHeap.size() - minHeap.size() > 1 || (minHeap.size() > 0 && maxHeap.getMax() > minHeap.getMin())) {
            minHeap.insert(maxHeap.deleteMax(0));
        }

        if (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.insert(minHeap.deleteMin(0));
        }
        return getMedian();
    }

    public int getMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return maxHeap.getMax();
        }
        if (minHeap.size() > maxHeap.size()) {
            return minHeap.getMin();
        }
        return maxHeap.getMax();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            AllTimeMedian allTimeMedian = new AllTimeMedian();
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] input = bufferedReader.readLine().split(" ");
            for (String s : input) {
                stringBuffer.append(allTimeMedian.processData(Integer.parseInt(s))).append(" ");
            }
            stringBuffer.append("\n");
            t--;
        }
        System.out.println(stringBuffer);
//        while (true) {
//            String input = bufferedReader.readLine();
//            if (input.equals("E")) {
//                System.exit(1);
//            } else {
//                allTimeMedian.processData(Integer.parseInt(input));
//                System.out.println(allTimeMedian.getMedian());
//            }
//        }
    }

}
