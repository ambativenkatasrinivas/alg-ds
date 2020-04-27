package com.srinivas.codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NextRound {
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputStream.readLine();
        String nk[] = firstLine.split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        String arr[] = inputStream.readLine().split(" ");
        int scores[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            scores[i] = Integer.parseInt(arr[i]);
        }
        int qc = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 0 && scores[i] >= scores[k-1]) {
                qc++;
            }
        }
        System.out.println(qc );
    }
}
