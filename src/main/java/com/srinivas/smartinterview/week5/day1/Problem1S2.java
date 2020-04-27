package com.srinivas.smartinterview.week5.day1;

public class Problem1S2 {
    public static void main(String[] args) {
        String string1[] = {"x", "x", "c", "c", "c", "y", "y", "a", "c", "b", "a", "y", "x", "c", "c", "y", "y", "c", "x", "a", "x", "x", "b", "y"};
        //String string1[] = {"a", "b", "c"};
        String string2[] = {"a", "y", "y", "x", "b"};

        solution2(string1, string2);
    }

    static void solution2(String string1[], String string2[]) {
        int countArray[] = getCountArray(string2);
        int start = -1, end = -1;
        for (int i = 1; i < string1.length; i++) {
            for (int j = i; j < string1.length; j++) {
                String subString[] = new String[(j-i)];
                int index = 0;
                for (int k = i; k < j; k++) {
                    subString[index] = string2[index];
                    index++;
                }
                int subArrayCountArray[] = getCountArray(subString);
                if (isValid(countArray, subArrayCountArray)) {
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Minimum substring length=  "+ (end - start)+1);
        for (int i = start;i<=end;i++) {
            System.out.print(" "+string1[i]);
        }
    }

    private static boolean isValid(int[] countArray, int[] subArrayCountArray) {
        for (int i = 0; i < 26; i++) {
            if (subArrayCountArray[i] < countArray[i]) {
                return false;
            }
        }
        return true;
    }

    private static int[] getCountArray(String[] string) {
        int countArray[] = new int[26];
        for (int i = 0; i < string.length; i++) {
            countArray[getASCII(string[i]) - 96]++;
        }
        return countArray;
    }

    private static int getASCII(String string) {

        return (int) string.charAt(0);
    }
}
