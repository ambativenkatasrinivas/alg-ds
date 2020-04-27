package com.srinivas.smartinterview.week10;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// it's occuring fibbnoci style
/*

0
1
2

00
01
10
3

3
000
001
010
100
101
5
...
 */
public class BinaryStringsWithNoAdjacent1s {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        fibN(100000);
        while (t > 0) {
            stringBuffer.append(fib[Integer.parseInt(bufferedReader.readLine())]).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    static int fib[] = new int[100001];
    static double mod = 1e9 + 7;
    private static void fibN(int n) {
        fib[0] = 1;
        fib[1] = 2;
        for (int i = 2; i < n; i++) {
            fib[i] = new Double((fib[i - 1] % mod + fib[i - 2] % mod) % mod).intValue();
        }
    }
}
