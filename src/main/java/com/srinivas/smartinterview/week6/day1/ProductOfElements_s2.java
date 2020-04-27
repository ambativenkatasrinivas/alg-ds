package com.srinivas.smartinterview.week6.day1;

import com.srinivas.common.Util;

/**
 * sp = suffix product
 */
public class ProductOfElements_s2 {
    public static void main(String[] args) {
        int[] arr = {3, -2, 3, 1};
        int[] productArr = new int[arr.length];
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            productArr[i] = product/arr[i];
        }

        Util.print(productArr);
    }
}
