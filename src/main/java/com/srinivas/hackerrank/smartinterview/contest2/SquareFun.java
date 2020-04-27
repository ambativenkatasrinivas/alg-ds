package com.srinivas.hackerrank.smartinterview.contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.lang.*;
import java.math.BigInteger;

public class SquareFun {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        int t = Integer.parseInt(bufferedReader.readLine());
//        StringBuffer stringBuffer = new StringBuffer();
//        while (t > 0) {
//            String line = bufferedReader.readLine();
//            String[] ele = line.split(" ");
//            long a = Long.parseLong(ele[0]);
//            long b = Long.parseLong(ele[1]);
//            long tempB = sqrB(b);
//            long tempA = sqrA(a);
//            if (tempB >= tempA) {
//                stringBuffer.append((tempB - tempA) + 1).append("\n");
//            } else {
//                stringBuffer.append(0).append("\n");
//            }
//            t--;
//        }
//        System.out.println(stringBuffer);
        System.out.println(sqrB(Long.parseLong("1000000000")));
//        System.out.println(sqrB(Long.parseLong("16")/2)  + sqrB(Long.parseLong("16")/2) );

    }

    private static long sqrA(long n) {
        long low = 1, high = n;
        long sqr = 0;
        while (low <= high) {
            long mid = (high + low) / 2;
            if (mid * mid > n) {
                high = mid - 1;
                sqr = mid;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return sqr;
    }

    private static long sqrB(long n) {
        long low = 1, high = n;
        long sqr = 0;
        while (low <= high) {
            long mid = (high + low) / 2;
//            long mid = (BigInteger.valueOf(high).add(BigInteger.valueOf(low))).divide(BigInteger.valueOf(2)).longValue();
            if ((BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid))).longValue() > n) {
                high = mid - 1;
            } else if ((BigInteger.valueOf(mid).multiply(BigInteger.valueOf(mid))).longValue() < n) {
                sqr = mid;
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return sqr;
    }

//    private static long sqrB(long n) {
//        BigInteger low = BigInteger.valueOf(1);
//        BigInteger high = BigInteger.valueOf(n);
//        long sqr = 0;
//        while (low.longValue() <= high.longValue()) {
//            long mid = high.add(low).divide(BigInteger.valueOf(2)).longValue();
//            if (mid * mid > n) {
//                high = BigInteger.valueOf(mid - 1);
//            } else if (mid * mid < n) {
//                sqr = mid;
//                low = BigInteger.valueOf(mid - 1);
//            } else {
//                return mid;
//            }
//        }
//        return sqr;
//    }
}
