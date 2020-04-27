package com.srinivas.hackerrank.smartinterview.page1_7;

public class NumberOfValidSubarrays {
    public static void main(String[] args) {
//        String string1[] = {"x", "x", "c", "c", "c", "y", "y", "a", "c", "b", "a", "y", "x", "c", "c", "y", "y", "c", "x", "a", "x", "x", "b", "y"};
        String string1[] = {"1", "0", "1", "0", "0", "1", "0", "0", "1", "1"};

        for (int i = 0; i < string1.length; i++) {
            for (int j = i; j < string1.length; j++) {
                //System.out.println(" length= "+ (j-i));

                int zeroCount=0;
                int onesCount=0;
                for (int l=i;l<=j;l++) {
                    if (string1[l].equals("0")) {
                        zeroCount++;
                    } else {
                        onesCount++;
                    }
                }
                if (zeroCount==onesCount)
                    for (int k=i;k<=j;k++) {
                        System.out.print(" "+string1[k] );
                    }
                System.out.println();
            }
        }

    }
}
