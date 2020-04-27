package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestPalindromicSubstring {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer outputString = new StringBuffer();
        while (t > 0) {
            int stringSize = Integer.parseInt(bufferedReader.readLine());
            String string = bufferedReader.readLine();
            outputString.append(largestPalindromicSubstring(string) + "\n");
            t--;
        }
        System.out.println(outputString);
    }

    static int largestPalindromicSubstring(String string) {
        int lps = Integer.MIN_VALUE;
        int start = 0;
        if (string.length() <= 3) {
            if (string.charAt(0) == string.charAt(string.length() - 1)) {
                return string.length();
            }
        }

        for (int i = 0; i < string.length(); i++) {
            //(string.length() - 1) / 2 != i &&

            if (i == 1) {
                if (string.charAt(1) == string.charAt(2)) {
                    lps = 2;
                }
                if (string.charAt(0) == string.charAt(2)) {
                    lps = 3;
                }
            }

            if (i % 2 != 0) {
                int p1 = i, p2 = i;
                if ((string.length() - 1) / 2 == i) {
                    p1 = i;
                    p2 = i + 1;
                } else {
                    p1 = i;
                    p2 = i;
                }
                while (p1 >= 0 && p2 < string.length() && string.charAt(p1) == string.charAt(p2)) {
//                    System.out.println("p1= " + p1 + " p2= " + p2);
                    int currentSize = (p2 - p1) + 1;
                    if (currentSize > lps) {
                        lps = currentSize;
                        start = p1;
                    }
                    p1--;
                    p2++;
                }
            } else {
                int p1 = i, p2 = i + 1;
                while (p1 >= 0 && p2 < string.length() && string.charAt(p1) == string.charAt(p2)) {
//                      System.out.println("p1= "+p1+" p2= "+p2);
                    int currentSize = (p2 - p1) + 1;
                    if (currentSize > lps) {
                        lps = currentSize;
                        start = p1;
                    }
                    p1--;
                    p2++;
                }
            }
        }
        return lps;
    }
}
