package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnclosingSubstring {

    public static void main(String[] args) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String input = bufferedReader.readLine();
            String[] strings = input.split(" ");
            stringBuilder.append(enclosingSubstring(strings[0] , strings[1])).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static int enclosingSubstring(String string1, String string2) {
        int[] mCountArray = getCountArray(string1);
        int[] nCountArray = new int[26];
        int p1 = 0;
        int p2 = 0;
        int ans = Integer.MAX_VALUE;
        while (p1 <= p2 && p2 <= string2.length()) {
            nCountArray = getCountArray(string2.substring(p1, p2));
            if (isValid(mCountArray, nCountArray)) {
                ans = Math.min(p2 - p1, ans);
                p1++;
            } else {
                p2++;
            }
        }

        if (ans == Integer.MAX_VALUE)
            ans = -1;
        return ans;
    }

    static boolean isValid(int[] mCountArray, int[] nCountArray) {
        for (int i =0;i<26;i++) {
            if (mCountArray[i] > nCountArray[i]) {
                return false;
            }
        }
        return true;
    }

    static int[] getCountArray(String string) {
        int[] countArray = new int[26];
        for (int i = 0; i < string.length(); i++) {
            countArray[string.charAt(i) - 'a']++;
        }
        return countArray;
    }
}
