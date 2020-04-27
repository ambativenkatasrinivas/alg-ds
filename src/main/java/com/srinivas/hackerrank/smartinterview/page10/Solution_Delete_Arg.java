package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_Delete_Arg {
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

        private void delete(int ele) {
            int cur = 1;
            while (cur < lastIndex && heap.get(cur) != ele) {
                cur++;
            }
            Collections.swap(heap, cur, lastIndex);
            heap.remove(lastIndex);
            lastIndex--;
            heapify(cur);
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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (q > 0) {
            String[] queries = bufferedReader.readLine().split(" ");
            if (Integer.parseInt(queries[0]) == 1) {
                minHeap.insert(Integer.parseInt(queries[1]));
            } else if (Integer.parseInt(queries[0]) == 2) {
                minHeap.delete(Integer.parseInt(queries[1]));
            } else {
                stringBuilder.append(minHeap.getMin()).append("\n");
            }

            q--;
        }
        System.out.println(stringBuilder);
    }
}
