package com.srinivas.codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WayTooLongWords {

    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        int firstLine = Integer.parseInt(inputStream.readLine());
        int count = 0;
        String strings[] = new String[firstLine];
        while (count < firstLine) {
            strings[count] = inputStream.readLine();
            count++;
        }
        for (String string : strings) {
            if (string != null && string.length() > 10) {
                System.out.println(string.charAt(0) + Integer.toString(string.length() - 2) + string.charAt(string.length() - 1));
            } else {
                System.out.println(string);
            }
        }
    }
}
