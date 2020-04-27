package com.srinivas.smartinterview.week3.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Square root using brute force method
public class SquareRoot {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = bufferedReader.readLine();
        int input = Integer.parseInt(inputString);

        for (int i = 1; i <= input; i++) {
            if (i * i == input) {
                System.out.println("Square root is: " + i);
            }
        }
    }
}
