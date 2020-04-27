package com.srinivas.smartinterview.week5.day1;

public class PrintCountForChar {
    public static void main(String[] args) {

        String string = "smartinterview";
        int countArray[] = new int[26];
        for (int i = 0; i < string.length(); i++) {
            countArray[(int) string.charAt(i) - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            if (countArray[i] > 0) {
                System.out.println(((char) (i + 97)) + "   " + countArray[i]);
            }
        }
    }
}
