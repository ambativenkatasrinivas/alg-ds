package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_No_Delete_Arg {
    static class MinHeap {
        List<Integer> heap;
        int lastIndex;

        public MinHeap() {
            heap = new ArrayList<>(100000);
            for (int i = 0; i < 100000; i++) {
                heap.add(i, 0);
            }
            lastIndex = 0;
        }

        private void insert(int ele) {
            heap.add(++lastIndex, ele);
            int cur = lastIndex;
            while (cur > 1 && heap.get(cur) < heap.get(cur / 2)) {
                Collections.swap(heap, cur, cur / 2);
                cur = cur / 2;
            }
        }

        private void delete() {
            if (lastIndex > 0) {
                Collections.swap(heap, 1, lastIndex);
                heap.remove(lastIndex);
                lastIndex--;
                heapify(1);
            }
        }

        private void heapify(int i) {
            int left = i * 2;
            int right = i * 2 + 1;
            int smallest = i;
            if (left < lastIndex && heap.get(smallest) > heap.get(left)) {
                smallest = left;
            }

            if (right < lastIndex && heap.get(smallest) > heap.get(right)) {
                smallest = right;
            }

            // If smallest is not root
            if (smallest != i) {
                Collections.swap(heap, smallest, i);
                heapify(smallest);
            }
        }

        private String getMin() {
            if (lastIndex > 0) {
                return heap.get(1) + "";
            } else {
                return "Empty";
            }
        }
    }

    public static void main(String[] args) throws IOException {
        MinHeap minHeap = new MinHeap();
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine());
        while (q > 0) {
            String input[] = bufferedReader.readLine().split(" ");
            if (input[0].equals("insert")) {
                minHeap.insert(Integer.parseInt(input[1]));
            } else if (input[0].equals("getMin")) {
                stringBuilder.append(minHeap.getMin()).append("\n");
            } else {
                minHeap.delete();
            }
            q--;
        }
        System.out.println(stringBuilder);
    }
}
