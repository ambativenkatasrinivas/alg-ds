package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MinHeap_Old {
    List<Integer> heap;
    int lastIndex;

    public MinHeap_Old() {
        heap = new ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            heap.add(i, 0);
        }
        lastIndex = 0;
    }

    public void insert(int ele) {
        heap.add(++lastIndex, ele);
        while (lastIndex / 2 > 0 && heap.get(lastIndex) < heap.get(lastIndex / 2)) {
            swap(lastIndex, lastIndex / 2);
        }
    }

    public void delete() {
        heap.add(1, heap.get(lastIndex--));
        int cur = 1;
        while (cur * 2 < lastIndex && heap.get(cur) > heap.get(cur * 2)) {
            swap(cur, cur * 2);
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

    private void swap(int first, int second) {
        int temp = heap.get(first);
        heap.add(first, heap.get(second));
        heap.add(second, temp);
    }

    public static void main(String[] args) throws IOException {
        MinHeap_Old minHeap = new MinHeap_Old();
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
                minHeap.delete();
            } else {
                stringBuilder.append(minHeap.getMin()).append("\n");
            }

            q--;
        }
        System.out.println(stringBuilder);
    }
}
