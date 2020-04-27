package com.srinivas.hackerrank.smartinterview.page1_7;

import com.sun.imageio.plugins.common.I18N;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SumOfPairs {
    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());

        while (t > 0) {
            String line1 = bufferedReader.readLine();
            String line1String[] = line1.split(" ");

            int arrSize = Integer.parseInt(line1String[0]);
            long k = Long.parseLong(line1String[1]);
            String line2 = bufferedReader.readLine();
            String line2String[] = line2.split(" ");
            long arr[] = new long[arrSize];
            for (int i = 0; i < line2String.length; i++) {
                arr[i] = Long.parseLong(line2String[i]);
            }

            Arrays.sort(arr);
            Boolean isSumFind = new Boolean(false);
            for (int i = 0; i < arr.length; i++) {
                isSumFind = binarySearch(arr, k - arr[i] ,i);
                if (isSumFind) {
                break;
                }
            }

            if (isSumFind) {
                stringBuilder.append("True");
            } else {
                stringBuilder.append("False");
            }
            stringBuilder.append("\n");
            t--;
        }
        System.out.println(stringBuilder.toString().substring(0, stringBuilder.length()-1));
    }

    public static boolean binarySearch(long arr[], long k, int i) {
        int low = 0;
        int hight = arr.length - 1;

        while (low <= hight) {
            int mid = (low + hight) / 2;
            if (arr[mid] == k && mid != i) {
                return true;
            } else if (arr[mid] > k) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
