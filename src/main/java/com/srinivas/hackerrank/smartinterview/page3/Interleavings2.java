package com.srinivas.hackerrank.smartinterview.page3;

public class Interleavings2 {

    private static void generate(String str, String str1, String str2, boolean isDuplicateStr1[], boolean isDuplicateStr2[], char[] gs, int idx, int i, int j) {

        if (idx == str.length()) {
            System.out.println(gs);
        }

//        for (int i = 0; i < str1.length(); i++) {
        if (i < str1.length() && !isDuplicateStr1[i]) {
            gs[idx] = str1.charAt(i);
            isDuplicateStr1[i] = true;
//            generate(str, str1, str2, isDuplicateStr1, isDuplicateStr2, gs, idx + 1, i + 1, j);
//                isDuplicateStr1[i] = false;
        }
//            for (int j = 0; j < str2.length(); j++) {
        if (j < str2.length() && !isDuplicateStr2[j]) {
            isDuplicateStr2[j] = true;
            gs[idx] = str2.charAt(j);
            generate(str, str1, str2, isDuplicateStr1, isDuplicateStr2, gs, idx + 1, i, j + 1);

        }
        if (j < str2.length()) {
            isDuplicateStr2[j] = false;
        }
        if (i < str1.length()) {
            isDuplicateStr1[i] = false;
            generate(str, str1, str2, isDuplicateStr1, isDuplicateStr2, gs, idx + 1, i + 1, j);
        }
//            }

//        if (!isDuplicate[i]) {
//            gs[idx] = str.charAt(i);
//            isDuplicate[i] = true;
//            generate(str, str1, str2, isDuplicate, gs, idx + 1);
//            isDuplicate[i] = false;
//        }
    }

    public static void main(String[] args) {
        String str1 = "nkb";
        String str2 = "gl";
        String str = str1 + str2;
        generate(str, str1, str2, new boolean[str1.length()], new boolean[str2.length()], new char[str.length()], 0, 0, 0);
    }
}
