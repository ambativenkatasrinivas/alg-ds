package com.srinivas.smartinterview.week6.day1;

import com.srinivas.common.Util;

/**
 * Product of all the elements of array except i-th element;
 *
 *  N * N, N
 */
public class ProductOfElements {
    public static void main(String[] args) {

        int[] arr = {3, -2, 3, 1};
        int[] poductArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            poductArr[i] = product;
        }
        Util.print(poductArr);
    }
}
