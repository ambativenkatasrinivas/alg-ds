package com.srinivas.hackerrank.smartinterview.page1_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFirstRepeatingCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        while (t > 0) {
            stringBuilder.append(findFirstRepeatingCharacter(bufferedReader.readLine())).append("\n");
            t--;
        }
        System.out.println(stringBuilder);
    }

    private static String findFirstRepeatingCharacter(String line) {
        int arr[] = new int[26];
        for (int i = 0; i < line.length(); i++) {
                arr[line.charAt(i) - 'a'] += 1;
        }
        for (int i = 0; i < line.length(); i++) {
            if (arr[line.charAt(i) - 'a'] > 1) {
                return line.charAt(i) + "";
            }
        }
        return ".";
    }
}
