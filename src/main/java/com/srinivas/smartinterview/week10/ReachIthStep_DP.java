package com.srinivas.smartinterview.week10;

// Reach ith step
public class ReachIthStep_DP {

    public static void main(String[] args) {

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        System.out.println("To reach 4 with 1 and 2 steps at time no.of are " + reachIthStep(4));
        System.out.println("To reach 5 with 1 and 2 steps at time no.of are " + reachIthStep(5));
        System.out.println("To reach 6 with 1 and 2 steps at time no.of are " + reachIthStep(6));

    }

    static int arr[] = new int[100];

    static int reachIthStep(int n) {
        for (int i = 3; i <= n; i++) {
            if (arr[i] == 0) {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        return arr[n];
    }

}
