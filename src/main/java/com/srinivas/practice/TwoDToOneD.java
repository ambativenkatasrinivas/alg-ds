package com.srinivas.practice;

public class TwoDToOneD {

    public static void main(String args[]) {
        int s[][] = {{4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        int t[] = new int[9];
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                t[count++] = s[i][j];
            }
        }

        for (int i=0;i<9;i++){
            System.out.println(t[i] + " ");
        }
    }

}
