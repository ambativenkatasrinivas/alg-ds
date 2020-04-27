package com.srinivas.hackerrank.smartinterview.contest2;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckSubsequence {
    public static void main(String[] args) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            String[] strings = bufferedReader.readLine().split(" ");
            if (checkSubsequence(strings[0], strings[1])) {
                stringBuffer.append("Yes").append("\n");
            } else {
                stringBuffer.append("No").append("\n ");

            }
            t--;
        }
        System.out.println(stringBuffer.substring(0,stringBuffer.length()-1));
    }

    private static boolean checkSubsequence(String s1, String s2) {
        int p2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s1.charAt(p2) == s2.charAt(i)) {
                if (p2 == s1.length() - 1) {
                    return true;
                }
                p2++;
            }
        }
        return false;
    }
}
