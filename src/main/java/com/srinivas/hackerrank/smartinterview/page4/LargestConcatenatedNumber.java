package com.srinivas.hackerrank.smartinterview.page4;

import com.srinivas.common.Util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestConcatenatedNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String ele[] = bufferedReader.readLine().split(" ");
            int arr[] = new int[ele.length];
            for (int i = 0; i < ele.length; i++) {
                arr[i] = Integer.parseInt(ele[i]);
            }
            stringBuffer.append(largestConcatenatedNumber(arr)).append("\n");
            t--;
        }

        System.out.println(stringBuffer);
//        for (int i = 1; i <= 1000; i++) {
//            System.out.print(i+" ");
//        }
    }

    private static int getBig(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        } else if (y > z) {
            return y;
        } else {
            return z;
        }
    }

    private static String largestConcatenatedNumber(int arr[]) {
        divide(arr, 0, arr.length - 1);
//        Util.print(arr);
        int arr1[] = new int[arr.length];
        int arr2[] = new int[arr.length];
        int arr3[] = new int[arr.length];
        int t = -1;
        int k1 = 0;
        int k2 = 0;
        int k3 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] <= 9) {
                arr1[k1++] = arr[i];
            } else if (arr[i] >= 10 && arr[i] <= 99) {
                arr2[k2++] = arr[i];
            } else if (arr[i] >= 100 && arr[i] <= 999) {
                arr3[k3++] = arr[i];
            } else if (arr[i] == 1000) {
                t = 1000;
            }
        }
        String num = "";
        int l1=0,l2=0,l3=0;
        for (int i = 0; i < arr.length; i++) {
            int x = -1, y = -1, z = -1;
            if (l1 < k1) {
                x = arr1[l1];
                x = (x * 1000) + 999;
            }
            if (l2 < k2) {
                y = arr2[l2];
                y = (y * 1000)/* + 99*/;
            }
            if (l3 < k3) {
                z = arr3[l3];
                z = z * 10;
            }
            int big = getBig(x, y, z);
            if (big < t) {
                big = t;
                t = -1;
            }
            if (big == x) {
                l1++;
                x = x - 999;
                big = x / 1000;
                x = -1;
            } else if (big == y) {
                l2++;
//                y = y - 99;
                big = y / 1000;
                y = -1;
            } else if(big == z){
                 z = z /10;
                 big = z;
                l3++;
            }
            num = num+"," + big;
        }
        return num;
    }

    private static void divide(int[] arr, int low, int high) {
        if (low == high) {
            return;
        }
        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);
        merge(arr, low, mid, mid + 1, high);
    }

    private static void merge(int[] arr, int low1, int high1, int low2, int high2) {
        int temp[] = new int[high2 - low1 + 1];
        int index = 0;
        int a = low1;
        while (a <= high1 && low2 <= high2) {
            if (arr[a] > arr[low2]) {
                temp[index] = arr[a];
                a++;
            } else {
                temp[index] = arr[low2];
                low2++;
            }
            index++;
        }
        while (a <= high1) {
            temp[index] = arr[a++];
            index++;
        }
        while (low2 <= high2) {
            temp[index] = arr[low2++];
            index++;
        }
        int x = low1;
        for (int i = 0; i < temp.length; i++) {
            arr[x] = temp[i];
            x++;
        }
    }
}
