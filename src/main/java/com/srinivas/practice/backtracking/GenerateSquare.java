package com.srinivas.practice.backtracking;

public class GenerateSquare {
    public static void main(String[] args) {
        int n = 3;
        boolean[] check = new boolean[n];
        int str[] = new int[n];
//        generateSquare(n, check, str, 0);
        generateSquare(n,1, str, 0);

    }

    static void generateSquare(int n,int i,/* boolean check[],*/ int str[], int index) {
        if (index == n) {
//            if (validateMagicSquare(str)) {
                for (int x = 0; x < index; x++) {
                    System.out.print(str[x]);
                }
                System.out.println();
//            }
        }
//        for (int i = 1; i <= n; i++) {
            if (index < n){
//            if (!check[i - 1]) {
//                check[i - 1] = true;
                str[index] = i;
                generateSquare(n, i,/*check,*/ str, index + 1);
                i = 2;
                generateSquare(n, i,/*check,*/ str, index + 1);
                i=3;
                generateSquare(n, i,/*check,*/ str, index + 1);


                //                check[i - 1] = false;
            }
//        }
    }

    private static boolean validateMagicSquare(int str[]) {
        return (str[0] + str[1] + str[2] == 15 && str[3] + str[4] + str[5] == 15 && str[6] + str[7] + str[8] == 15
                && str[0] + str[4] + str[8] == 15 && str[2] + str[4] + str[6] == 15&& str[0] + str[3] + str[6] == 15
                && str[1] + str[4] + str[7] == 15&& str[2] + str[5] + str[8] == 15
        );
    }

}
