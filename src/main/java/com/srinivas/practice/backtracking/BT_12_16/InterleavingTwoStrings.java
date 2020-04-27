package com.srinivas.practice.backtracking.BT_12_16;

public class InterleavingTwoStrings {
    private static void interleaving(String str1, String str2, int s1, int s2, int idx, char[] arr) {
        if (idx == str1.length() + str2.length()) {
            System.out.println(new String(arr));
        }
        if (s1 != 0) {
            arr[idx] = str1.charAt(str1.length() - s1);
            interleaving(str1, str2, s1 - 1, s2, idx + 1, arr);
        }
        if (s2 != 0) {
            arr[idx] = str2.charAt(str2.length() - s2);
            interleaving(str1, str2, s1, s2 - 1, idx + 1, arr);
        }
    }

    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "45";
        interleaving(str1, str2, str1.length(), str2.length(), 0, new char[str1.length() + str2.length()]);
    }
}
