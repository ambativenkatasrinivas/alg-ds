package com.srinivas.interviewbit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntersessionOfSortedArrays {
    public static void main(String[] args) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        a.add(new Integer(1));
//        a.add(new Integer(2));
        a.add(new Integer(3));
        a.add(new Integer(3));
//        a.add(new Integer(4));
//        a.add(new Integer(5));
//        a.add(new Integer(6));

        List<Integer> b = new ArrayList<>();
        b.add(new Integer(3));
        b.add(new Integer(3));
        b.add(new Integer(5));

        System.out.println("A size "+a.size());
        System.out.println("Value = "+a.get(a.size()-1));

        int index = a.indexOf(1);
        if (index < a.size()-1 && a.get(index) == a.get(index + 1)) {
            System.out.println("done");
        }


        for (Integer i : b) {
            if (a.contains(i)) {
                a.remove(i);
                temp.add(i);
            }
        }
    }
}
