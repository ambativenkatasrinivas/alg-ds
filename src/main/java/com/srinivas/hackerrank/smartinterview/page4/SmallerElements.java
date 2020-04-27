package com.srinivas.hackerrank.smartinterview.page4;

import com.srinivas.hackerrank.smartinterview.page1_7.CollectingMangoes;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class SmallerElements {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine());
            String[] arr = bufferedReader.readLine().split(" ");
            int[] ele = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                ele[i] = Integer.parseInt(arr[i]);
            }

            stringBuffer.append("");
            t--;
        }
    }

    private static void smallerElements(int arr[]) {
        Stack<Integer> stack = new Stack();
        stack.push(arr[arr.length-1]);
        for (int i=arr.length-2;i>=0;i++) {


        }
    }
}
