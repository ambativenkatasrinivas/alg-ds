package com.srinivas.smartinterview.week5.day1;

// Length of longest palindrome substring in given string
public class Problem4 {
    public static void main(String[] args) {
        String string[] = {"a", "x", "x", "a", "y", "b", "b", "b", "y", "a", "x", "x", "y", "x", "a", "x", "y", "y", "x"};
        int ans = 0, start = -1;
        for (int i = 0; i < string.length; i++) {
            if (i % 2 == 0) {
                int p1 = i, p2 = i;
                while (p1 > 0 && p2 < string.length && string[p1] == string[p2]) {
                    if (ans < (p2 - p1) + 1) {
                        ans = (p2 - p1) + 1;
                        start = p1;
                    }
                    p1--;
                    p2++;
                }
            } else {
                int p1 = i, p2 = i + 1;
                while (p1 > 0 && p2 < string.length && string[p1] == string[p2]) {
                    if (ans < (p2 - p1) + 1) {
                        ans = (p2 - p1) + 1;
                        start = p1;
                    }
                    p1--;
                    p2++;
                }
            }
        }

        for (int i = start; i < start + ans; i++) {
            System.out.print(" " + string[i]);
        }

    }
}
