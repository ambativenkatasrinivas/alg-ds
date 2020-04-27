package com.srinivas.codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheatreSquare {

    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputStream.readLine();
        String arr[] = firstLine.split(" ");
        long n = Long.parseLong(arr[0]);
        long m = Long.parseLong(arr[1]);
        long a = Long.parseLong(arr[2]);
        long n1 = n/a;
        if (n%a != 0) {
            n1++;
        }
        long m1 = m/a;
        if (m%a != 0) {
            m1++;
        }
        System.out.println(n1*m1);
    }
}
