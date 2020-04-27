package com.srinivas.interviewbit;

import com.srinivas.common.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedListsII {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(new Integer(-4));
        arr.add(new Integer(3));


        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(new Integer(-2));
        arr1.add(new Integer(-2));

        mergeTwoSortedListsII(arr, arr1);
    }

    static List<Integer> mergeTwoSortedListsII(ArrayList<Integer> a, ArrayList<Integer> b) {
        int arr[] = a.stream().mapToInt(i->i).toArray();
        int arr1[] = b.stream().mapToInt(i->i).toArray();
        int arr3[] = new int[arr.length + arr1.length];
        int p3 = 0;
        int p1 = 0;
        int p2 = 0;

        while (p1 < arr.length && p2 < arr1.length) {
            if (arr[p1] < arr1[p2]) {
                arr3[p3] = arr[p1];
                p1++;
            } else {
                arr3[p3] = arr1[p2];
                p2++;
            }
            p3++;
        }

        while (p1 < arr.length) {
            arr3[p3] = arr[p1];
            p1++;
            p3++;
        }

        while (p2 < arr1.length) {
            arr3[p3] = arr1[p2];
            p2++;
            p3++;
        }

        List<Integer> temp = new ArrayList<>();
        for (int t : arr3) {
            temp.add(t);
        }
        a = (ArrayList<Integer>) temp;
        return a;
    }
}
