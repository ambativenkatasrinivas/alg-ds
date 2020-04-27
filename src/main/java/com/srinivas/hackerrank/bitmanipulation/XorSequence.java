package com.srinivas.hackerrank.bitmanipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XorSequence {

    static  class lr {
        long l;
        long r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputStream.readLine();
        lr[] arr = new lr[Integer.parseInt(firstLine)];
        int index = 0;
        while (index < Integer.parseInt(firstLine)) {
            String line = inputStream.readLine();
            String[] values = line.split(" ");
            arr[index] = new lr();
            arr[index].l = Integer.parseInt(values[0]);
            arr[index].r= Integer.parseInt(values[1]);
            index++;

        }
        for (lr value : arr) {
            xorSequence(value.l, value.r);
        }
    }

    static void xorSequence(long l, long r){
        long temp = 0;
            temp = temp ^ getValue(l-1) ^ getValue(r);
        System.out.println( temp);
    }

    static long getValue(long index) {
        long a =index%8;
        if(a == 0 || a == 1) return index;
        if(a == 2 || a == 3) return 2;
        if(a == 4 || a == 5) return index+2;
        if(a == 6 || a == 7) return 0;
        return 1l;
    }
}
