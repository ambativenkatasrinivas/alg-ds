package com.srinivas.smartinterview.week5.day1;

// Form the string1 i to j
// From the String2 k to l
// Check is equal or not
public class Problem2 {

    static long M = (long)1e9+7;
    public static void main(String[] args) {
        char string1[] = {'a', 'x', 'x', 'a', 'y', 'y', 'b', 'x', 'a', 'a', 'a', 'x', 'y', 'b', 'b', 'b'};
        char string2[] = {'b', 'y', 'y', 'b', 'x', 'a', 'b', 'a', 'y', 'b', 'a', 'y', 'y', 'b', 'b', 'b', 'c'};
        solution1(string1, string2, 5, 8, 2, 5);
    }

    static void solution1(char string1[], char string2[], int i, int j, int k, int l) {
        long power[] = new long[string2.length + 1];
        long hashString1[] = new long[string1.length];
        long hashString2[] = new long[string2.length];
        int primeNumber = 101;
        // Step1
        power[0]=1;
        for (int x = 1; x < power.length; x++) {
            power[x] = (long) ((power[x-1] * primeNumber)%M);
        }

        //Step2
        hashString1[0] = getHash(string1, power, 0);
        for (int x = 1; x < string1.length; x++) {
            hashString1[x] = (long) ((hashString1[x - 1] + getHash(string1, power, x))%M);
        }
        hashString2[0] = getHash(string2, power, 0);
        for (int x = 1; x < string2.length; x++) {
            hashString2[x] = (long) ((hashString2[x - 1] + getHash(string2, power, x))%M);
        }

        //Step3 -- Balance the powers
        int diff = Math.abs(k - i);
        long pbs = (((hashString2[k-1] - hashString2[l])%M)+M)%M, pas = (((hashString1[i-1] - hashString1[j])%M)+M)%M;

        if (i > k) {
            pbs = (pbs*power[diff])%M;
        } else {
            pas = (pas*power[diff])%M;
        }

        System.out.print(pas == pbs);
    }

    private static long getHash(char[] string1, long[] power, int i) {
        return (long) (((string1[i]) * power[i + 1])%M);
    }
}
