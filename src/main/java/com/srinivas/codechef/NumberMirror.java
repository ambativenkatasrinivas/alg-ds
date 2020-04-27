package com.srinivas.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberMirror {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int noofSums = 0;
        String temp = bufferedReader.readLine();
        if (temp != null) {
            noofSums = Integer.parseInt(temp);
            System.out.println(noofSums);
        }
    }
}

