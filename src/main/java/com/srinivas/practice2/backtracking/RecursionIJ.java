package com.srinivas.practice2.backtracking;

//Below is  OP
public class RecursionIJ {
    private static void recursionIJ(boolean[] arr, int i, int j, int n) {
        if (i <= n && j <= n) {
            if (arr[i] == false) {
                arr[i] = true;
                recursionIJ(arr, i + 1, j, n);
            }
            System.out.println("i= " + i + " j= " + j);
            recursionIJ(arr, i, j + 1, n);
        }
    }

    public static void main(String[] args) {
        recursionIJ(new boolean[5], 1, 1, 4);
    }
}

//i= 4 j= 1
//        i= 4 j= 2
//        i= 4 j= 3
//        i= 4 j= 4
//        i= 3 j= 1
//        i= 3 j= 2
//        i= 3 j= 3
//        i= 3 j= 4
//        i= 2 j= 1
//        i= 2 j= 2
//        i= 2 j= 3
//        i= 2 j= 4
//        i= 1 j= 1
//        i= 1 j= 2
//        i= 1 j= 3
//        i= 1 j= 4
