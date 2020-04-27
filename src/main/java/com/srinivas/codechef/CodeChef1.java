package com.srinivas.codechef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CodeChef1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String[] nk = scanner.nextLine().split(" ");

        int wd = 0;
        double ab = 0.00;
        if (scanner.hasNext()) {
            wd = scanner.nextInt();
        }
        if (scanner.hasNext()) {
            ab = scanner.nextDouble();
        }

        if (wd % 5 == 0) {
            if (wd + 0.50 <= ab) {
                double rab = ab - (wd + 0.50);
                System.out.printf("%.2f", rab);
            } else {
                System.out.println(ab);
            }
        } else {
            System.out.println(ab);
        }
    }
}

