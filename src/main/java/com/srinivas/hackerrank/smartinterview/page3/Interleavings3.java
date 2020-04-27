package com.srinivas.hackerrank.smartinterview.page3;

import com.srinivas.practice.algorithms.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Interleavings3 {

    private static List<String> results = new ArrayList<>();
    private static void generate(String str1, String str2, int s1, int s2, char[] gs, int idx) {
        if (str2.length() != s2) {
            gs[idx] = str2.charAt(s2);
            generate(str1, str2, s1, s2 + 1, gs, idx + 1);
        }
        if (str1.length() != s1) {
            gs[idx] = str1.charAt(s1);
            generate(str1, str2, s1 + 1, s2, gs, idx + 1);
        }
        if (idx == gs.length) {
            results.add(new String(gs));
//            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int caseCount = 1;
        while (n > 0) {
            n--;
            String input[] = bufferedReader.readLine().split(" ");
            int size = input[0].length() + input[1].length();
            generate(input[0], input[1], 0, 0, new char[size], 0);
            System.out.println("Case #" + caseCount + ":");
            caseCount++;
            Collections.sort(results);
            for (String s : results){
                System.out.println(s);
            }
            results = new ArrayList<>();
        }

//        String str1 = "bn";
//        String str2 = "zh";
//        int caseCount = 1;
//        System.out.println("Case #"+caseCount+":");
//        caseCount++;
//        generate(str1, str2, 0, 0, new char[str1.length() + str2.length()], 0);
    }
}
