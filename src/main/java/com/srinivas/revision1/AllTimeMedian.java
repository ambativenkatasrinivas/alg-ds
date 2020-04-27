package com.srinivas.revision1;

public class AllTimeMedian {
    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 4, 2, 8, 5, 5};
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
            System.out.println(""+getMedian());
        }
    }

    static MinHeap minHeap = new MinHeap(100);
    static MaxHeap maxHeap = new MaxHeap(100);

    private static void insert(int data) {
        maxHeap.insert(data);
        if ((maxHeap.size() - minHeap.size() > 1) || minHeap.size() > 0 && maxHeap.getMax() > minHeap.getMin()) {
            minHeap.insert(maxHeap.getMax());
            maxHeap.delete();
        } else if ((minHeap.size() - maxHeap.size()) > 1) {
            maxHeap.insert(minHeap.getMin());
            minHeap.delete();
        }
    }

    private static float getMedian() {
        if (minHeap.size() == maxHeap.size()) {
            return ((float)(minHeap.getMin() + maxHeap.getMax()) / 2);
        } else if (minHeap.size() > maxHeap.size()) {
            return minHeap.getMin();
        } else {
            return maxHeap.getMax();
        }
    }
}
