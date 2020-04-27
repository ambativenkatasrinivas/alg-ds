package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LargestPalindromicSubstring2 {
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
        int lps = 1,p1,p2;

        for (int i = 0; i < string.length(); i++) {
            p1=i;
            p2=i;
            while(p1>=0 && p2<string.length() && string.charAt(p1)==string.charAt(p2))
            {
                p1--;
                p2++;
            }
            lps=Math.max(lps,p2-p1-1);
            p1=i;
            p2=i+1;
            while(p1>=0 && p2<string.length() && string.charAt(p1)==string.charAt(p2))
            {
                p1--;
                p2++;
            }
            lps=Math.max(lps,p2-p1-1);
        }
        return lps;
    }
}
