package com.srinivas.hackerrank.smartinterview.page4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindingCubeRoot {

    private static long findingCubeRoot(long n) {
        long low = 1, high = n;
        while (low <= high) {
            long mid = (high + low) / 2;
            long coubRoot = mid * mid * mid;
            if (coubRoot == n) {
                return mid;
            }
            if (coubRoot > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        long t = Long.parseLong(bufferedReader.readLine());
        while (t > 0) {
            long n = Long.parseLong(bufferedReader.readLine());
            if (n > 0) {
                stringBuffer.append(findingCubeRoot(n)).append("\n");
            } else {
                stringBuffer.append(-(findingCubeRoot(-(n)))).append("\n");
            }
            t--;
        }
        System.out.println(stringBuffer);
//        findingCubeRoot(27);
//        findingCubeRoot(125);
//        findingCubeRoot(1000);
//        findingCubeRoot(6859);
//        findingCubeRoot(19683);
    }
}
