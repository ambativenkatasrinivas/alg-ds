package com.srinivas.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

public class Birthday {

    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {
        int total = 0;
        if (s.size() == 1 && s.get(0) == d) {
            return 1;
        } else if (s.size() == 1) {
            return 0;
        }

        for (int i = 0; i < s.size(); i++) {
            int sum=0;
            for (int j = i; j < m+i && j < s.size(); j++) {
                sum = sum + s.get(j);
                System.out.println(s.get(j));
            }
            System.out.println("sum "+sum);
            if (sum == d) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
//        5
//        1 2 1 3 2
//        3 2
        List<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(5);
        s.add(1);
        s.add(3);
        s.add(4);
        s.add(4);
        s.add(3);
        s.add(5);
        s.add(1);
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(4);
        s.add(1);
        s.add(3);
        s.add(3);
        s.add(4);
        s.add(2);
        s.add(1);
//        s.add(1);
//        s.add(2);
//        s.add(1);
//        s.add(3);
//        s.add(2);
//        System.out.println(birthday(s, 3, 2));
        System.out.println(birthday(s, 18, 7));

    }
}
