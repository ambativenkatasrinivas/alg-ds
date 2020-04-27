package com.srinivas.hackerrank.smartinterview.contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Temp {
    static final int MAX = 1000000;
    static int prefix[] = new int[MAX + 1];

    static void buildPrefix() {
        boolean prime[] = new boolean[MAX + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= MAX; p++) {
            if (prime[p] == true) {
                for (int i = p * 2; i <= MAX; i += p) {
                    prime[i] = false;
                }
            }
        }
        prefix[0] = prefix[1] = 0;
        for (int p = 2; p <= MAX; p++) {
            prefix[p] = prefix[p - 1];
            if (prime[p]) {
                prefix[p]++;
            }
        }
    }

    static int query(int L, int R) {
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) throws IOException {
        buildPrefix();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            String line = bufferedReader.readLine();
            String ele[] = line.split(" ");
            stringBuffer.append(query(Integer.parseInt(ele[0]), Integer.parseInt(ele[1]))).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }
}
