package com.srinivas.hackerrank.string;

public class CamelCase {
    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }

    static int camelcase(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count + 1;
    }

}
