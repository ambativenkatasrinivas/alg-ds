package com.srinivas.hackerrank.gametheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AChessboardGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        StringBuffer stringBuffer = new StringBuffer();
        while (t > 0) {
            String input = bufferedReader.readLine();
            String[] inputs = input.split(" ");
            int x = Integer.parseInt(inputs[0]);
            int y = Integer.parseInt(inputs[1]);
            stringBuffer.append(chessboardGame(x, y)).append("\n");
            t--;
        }
        System.out.println(stringBuffer);
    }

    static String chessboardGame(int x, int y) {
        if ((x <= 2 || x >= 15) && (y <= 2 || y >= 15)) {
            return "Second";
        } else {
            return "First";
        }
    }

}
