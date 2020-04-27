package com.srinivas.hackerrank.smartinterview.page10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ComputeFactorial {

    public static void main(String[] args) throws IOException {

        factorial[0] = 1;
        factorial[1] = 1;
//        System.out.println("6 " + getFactorial(6));
//        System.out.println("6 " + getFactorial(6));
//        System.out.println("5 " + getFactorial(5));
//        System.out.println("5 " + getFactorial(5));
//        System.out.println("6 " + getFactorial(6));
//        System.out.println("4 " + getFactorial(4));
//        System.out.println("4 " + getFactorial(4));
//        System.out.println("3 " + getFactorial(3));
//
//        System.out.println("20 " + getFactorial(20));
//        System.out.println("50 " + getFactorial(50));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            stringBuffer.append(getFactorial(Integer.parseInt(bufferedReader.readLine()))).append("\n");

            t--;
        }

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(stringBuffer.toString());
        bufferedWriter.flush();
    }

    static long factorial[] = new long[10000001];


    //TODO: Calculate factorial for the range 10000001 for each query get value from array.
    private static long getFactorial(int n) {

//        for (int i = 1; i <= n; i++) {
//            double mod = 1e9 + 7;
//            if (factorial[i] == 0) {
//                factorial[i] = new Double((factorial[i - 1] % mod) * (i % mod) % mod).longValue();
//            }
//        }
        int idx = n;
        while (factorial[idx] == 0) {
            idx--;
        }

        for (int i = idx + 1; i <= n; i++) {
            double mod = 1e9 + 7;
                factorial[i] = new Double((factorial[i - 1] % mod) * (i % mod) % mod).longValue();
        }
        return factorial[n];
    }
}
