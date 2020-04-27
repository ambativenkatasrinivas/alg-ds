package com.srinivas.smartinterview.week10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSubArraySum {
    public static void main(String[] args) throws IOException {

//        int arr2[] = {-24, 0, 28, 28, 55, -31, -27, -45, -24};
//        int result2[] = maxSubArrSum(arr2);
//        System.out.println(result2[0] + " " + result2[1] + " " + result2[2]);
//
//        int arr[] = {40, 5, 39, 45, 31, -44, 73, -16, -31, 27};
//        int result[] = maxSubArrSum(arr);
//        System.out.println(result[0] + " " + result[1] + " " + result[2]);
//
//        int arr1[] = {57, 18, -14, 17, 31, 16, -16};
//        int result1[] = maxSubArrSum(arr1);
//        System.out.println(result1[0] + " " + result1[1] + " " + result1[2]);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] stringArr = bufferedReader.readLine().split(" ");
            int[] arr = new int[stringArr.length];
            for (int i = 0; i < stringArr.length; i++) {
                arr[i] = Integer.parseInt(stringArr[i]);
            }
//            maxSubArraySum(arr, arr.length);

            int[] result = maxSubArraySum(arr, arr.length);
            stringBuffer.append(result[0]).append(" ").append(result[1]).append(" ").append(result[2]).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    static int[] maxSubArraySum(int a[], int size)
    {
        int max_so_far = Integer.MIN_VALUE,
                max_ending_here = 0,start = 0,
                end = 0, s = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here += a[i];

            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
                start = s;
                end = i;
            }

            if (max_ending_here < 0)
            {
                max_ending_here = 0;
                s = i + 1;
            }
        }

        int result[] = new int[3];
        result[0] = max_so_far;
        result[1]= start;
        result[2] = end;
        return result;
//        System.out.println("Maximum contiguous sum is "
//                + max_so_far);
//        System.out.println("Starting index " + start);
//        System.out.println("Ending index " + end);
    }

    private static int[] maxSubArrSum(int[] arr) {
        int result[] = new int[3];
        int KA[] = new int[arr.length];
        result[0] = arr[0];
        KA[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            KA[i] = max(KA[i - 1] + arr[i], 0);
            if (result[0] <= KA[i]) {
                result[0] = KA[i];
                result[2] = i;
            }

            if (KA[i] < 0 && result[2] >=i) {
                KA[i] = 0;
                result[1] = i ;
            }

        }

//        int max = result[0];
//        int li = result[2];
//        while ( li >= 0 && (max > 0 || arr[li] == 0)) {
//            max = max - arr[li];
//            li--;
//        }
//        result[1] = li + 1;
        return result;
    }

    private static int max(int a, int b) {
        return (a > b) ? a : b;
    }

}
