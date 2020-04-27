package com.srinivas.hackerrank.smartinterview.page3;

public class Interleavings {

    private static void generate(String str, String str1,String str2, boolean isDuplicate[], char[] gs, int idx) {

        if (idx == str.length()) {
            if (isValid(new String(gs), str1, str2)) {
                System.out.println(gs);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (!isDuplicate[i]) {
                gs[idx] = str.charAt(i);
                isDuplicate[i] = true;
                generate(str, str1, str2, isDuplicate, gs, idx + 1);
                isDuplicate[i] = false;
            }
        }
    }

    private static boolean isValid(String gs, String str1, String str2) {
        if (!isSubSequence(str1, gs, str1.length(), gs.length())) {
            return false;
        } else {
            return isSubSequence(str2, gs, str2.length(), gs.length());
        }
    }

    static boolean isSubSequence(String str1, String str2, int m, int n)
    {
        // Base Cases
        if (m == 0)
            return true;
        if (n == 0)
            return false;

        // If last characters of two strings are matching
        if (str1.charAt(m-1) == str2.charAt(n-1))
            return isSubSequence(str1, str2, m-1, n-1);

        // If last characters are not matching
        return isSubSequence(str1, str2, m, n-1);
    }

    private static boolean validateWithStr(String gs, String str) {
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            while (str.charAt(i) != gs.charAt(j) ) {
                    j++;
            }
        }

        if (j == str.length()-1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        String str1 = "gl";
        String str2 = "nkb";
        String str = str1 + str2;
        generate(str, str1, str2, new boolean[str.length()], new char[str.length()], 0);
    }
}
