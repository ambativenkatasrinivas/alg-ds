package com.srinivas.hackerrank.bitmanipulation;

import com.sun.imageio.plugins.common.I18N;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSetBits {
    static int limit = 100001;
    static long values[];

    private static void twoSetBits() {
        int x = 1;
        for (int i = 1; x < limit; i++) {
            for (int j = 0; j < i; j++) {
                if (x < limit) {
                    values[x] = new Double(((1l << i) | (1l << j)) % (1e9 + 7)).intValue();
                System.out.println("x= "+x+" "+values[x]);
                    x++;
                }
            }
        }

    }

    static void printTwoSetBitNums(int n)
    {
        // Initialize higher of two sets bits
        int idx = 1;
        int x = 1;

        // Keep reducing n for every number
        // with two set bits
        while (n > 0)
        {
            // Consider all lower set bits for
            // current higher set bit
            int y = 0;
            while (y < x)
            {
                // Print current number
//                System.out.print(((1 << x) + (1 << y)) +" ");

                values[idx] = new Double(((1l << x) + (1l << y)) %(1e9+7)).intValue();
                idx++;
                // If we have found n numbers
                n--;
                if (n == 0)
                    return;

                // Consider next lower bit for current
                // higher bit.
                y++;
            }

            // Increment higher set bit
            x++;
        }
    }

    public static void main(String[] args) throws IOException {

        values = new long[limit+10];
     printTwoSetBitNums(limit);
//        twoSetBits();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            stringBuffer.append(values[n]).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
//        System.out.println((1 << 1) | (1 << 0));
//        System.out.println((1 << 2) | (1 << 1));
//        System.out.println((1 << 5) | (1 << 4));

    }
}
