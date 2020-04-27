package com.srinivas.smartinterview.week5.day1;

// Given two strings String2 is substring fo String1 or not
public class Problem3 {
    public static void main(String[] args) {
        double M = 10e9 + 7;
        String string1[] = {"a", "x", "y", "y", "x", "b", "x", "x", "y", "y", "a", "x", "x", "b", "y", "c", "c", "b", "x"};
        String string2[] = {"y", "a", "x", "x", "b"};
        long power[] = new long[string1.length + 1];
        int primeNumber = 101;
        // Step1
        for (int x = 0; x < power.length; x++) {
            power[x] = (int) (Math.pow(primeNumber, x) % M);
        }

        //Step2
//        int hashString1 = 0;
//        int hashString2 = 0;
//        for (int i = 0; i < string2.length; i++) {
//            hashString1 = (int) ((hashString1 + (getASCIIValue(string1[i]) * power[i + 1])) % M);
//        }
//
//        for (int i = 0; i < string2.length; i++) {
//            hashString2 = (int) ((hashString2 + (getASCIIValue(string2[i]) * power[i + 1])) % M);
//        }

        int hashString1 = 0;
        int hashString2 = 0;
        int m = string2.length;
        for (int i = 0; i < string2.length; i++) {
            hashString1 = (int) ((hashString1 + (getASCIIValue(string1[i]) * power[m - i])) % M);
        }

        for (int i = 0; i < string2.length; i++) {
            hashString2 = (int) ((hashString2 + (getASCIIValue(string2[i]) * power[m - i])) % M);
        }

        //Step3
        for (int i = 0; i < string1.length - m; i++) {
            hashString1 = (int) ((hashString1 - (getASCIIValue(string1[i]) * power[string2.length] + getASCIIValue(string1[m + i]) * primeNumber)) % M);

            if (hashString1 == hashString2) {
                System.out.println("Sub String fount at position: " + i);
            }
        }
    }

    static int getASCIIValue(String s) {
        return (int) s.charAt(0);
    }
}
