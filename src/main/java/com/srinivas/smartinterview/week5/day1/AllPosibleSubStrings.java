package com.srinivas.smartinterview.week5.day1;

public class AllPosibleSubStrings {
    public static void main(String[] args) {
        String string1[] = {"x", "x", "c", "c", "c", "y", "y", "a", "c", "b", "a", "y", "x", "c", "c", "y", "y", "c", "x", "a", "x", "x", "b", "y"};

        for (int i = 0; i < string1.length; i++) {
            for (int j = i; j < string1.length; j++) {
                System.out.println(" length= "+ (j-i));

                for (int k=i;k<=j;k++) {
                    System.out.print(" "+string1[k] );
                }
            }
        }

    }
}
