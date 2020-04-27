package com.srinivas.revision1;

public class MaximumContinuosSubArray {
    public static void main(String[] args) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        int maxEnding = 0;
        int maxSoFar = 0;
        int start = 0, end = 0;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            maxEnding = maxEnding + a[i];
            if (maxEnding > maxSoFar) {
                maxSoFar = maxEnding;
                start = s;
                end = i;
            } else if (maxEnding < 0) {
                maxEnding = 0;
                s = i + 1;
            }
        }

        System.out.println("Maximum sub array sum= " + maxSoFar);
        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
