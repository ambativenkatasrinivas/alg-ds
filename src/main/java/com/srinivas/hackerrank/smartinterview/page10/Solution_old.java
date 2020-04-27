package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution_old {
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

        public void insert(int ele) {
            heap.add(++lastIndex, ele);
            int cur = lastIndex;
            while (cur / 2 >= 0 && heap.get(cur) < heap.get(cur / 2)) {
//                swap(cur, cur / 2);
                Collections.swap(heap, cur, cur / 2);
                cur = cur / 2;
            }
        }

        public void delete(int ele) {
            int deleteIndex = 1;
            while (deleteIndex <= lastIndex && heap.get(deleteIndex) != ele) {
                deleteIndex++;
            }
//            heap.remove(deleteIndex);
            Collections.swap(heap,deleteIndex,lastIndex);
//            heap.add(deleteIndex, heap.get(lastIndex--));
            heap.remove(lastIndex);
            lastIndex--;
            int cur = deleteIndex;
            while (cur * 2 < lastIndex && heap.get(cur) > heap.get(cur * 2)) {
//                swap(cur, cur * 2);
                Collections.swap(heap, cur, cur * 2);
                cur = cur * 2;
            }
        }

        public int getMin() {
            if (lastIndex > 0) {
                return heap.get(1);
            } else {
                return -1;
            }
        }

//        private void swap(int first, int second) {
//            int temp1 = heap.remove(first);
//
//            int temp2 = heap.remove(second);
//            heap.add(first, temp2);
//            heap.add(second, temp1);
//        }

    }

    public static void main(String[] args) throws IOException {
        MinHeap minHeap = new MinHeap();
//        minHeap.insert(4);
//        minHeap.insert(9);
//        System.out.println(minHeap.getMin());
//        minHeap.delete();
//        System.out.println(minHeap.getMin());

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
