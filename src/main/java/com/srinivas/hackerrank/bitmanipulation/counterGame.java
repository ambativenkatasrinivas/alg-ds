package com.srinivas.hackerrank.bitmanipulation;

import static java.lang.Math.ceil;
import static java.lang.Math.floor;
import static java.lang.Math.log;

public class counterGame {
    public static void main(String[] args) {

        int n = 6;
        //System.out.println(log(936241636859394l) / log(2));
        System.out.println(counterGame(132));
      //  System.out.println(log(949637911572568l) / log(2));
        //System.out.println(counterGame(1050));

    }

    static String counterGame(long n) {
        char t = 'l';
        while (n > 1) {
            if ((n & (n - 1)) == 0) {
                System.out.println(n);
                if ((new Double(log(n) / log(2)).intValue() & 1) == 0) {
                    if (t == 'l') {
                        return "Richard";
                    } else {
                        return "Louise";
                    }

                } else {
                    if (t == 'l') {
                        return "Louise";
                    } else {
                        return "Richard";
                    }

                }
            } else {
                System.out.println(n+" "+(1l << new Double(log(n) / log(2)).intValue()) +" msb  "+ new Double(log(n) / log(2)).intValue());
                n = n - (1l << new Double(log(n) / log(2)).intValue());
            }
            if (t == 'l') {
                t = 'r';
            } else {
                t = 'l';
            }
        }
        if (t == 'l') {
            return "Richard";
        } else {
            return "Louise";
        }
    }

}
