package com.srinivas.smartinterview.week5.day1;

// Find Smallest sub string in String1 that contains all characters of String2
public class Problem1S1 {
    public static void main(String[] args) {
        String string1[] = {"x", "x", "c", "c", "c", "y", "y", "a", "c", "b", "a", "y", "x", "c", "c", "y", "y", "c", "x", "a", "x", "x", "b", "y"};
        //String string1[] = {"a", "b", "c"};
        String string2[] = {"a", "y", "y", "x", "b"};

        solution1(string1, string2);
    }

    static void solution1(String string1[], String string2[]) {
        int start=-1 , end = -1, size = Integer.MAX_VALUE;
        for (int i = 0; i < string1.length; i++) {
            for (int j = i; j < string1.length; j++) {
                String subString[] = new String[(string1.length - i)+1];
                int index = 0;
                for (int k = i; k <= j; k++) {
                    subString[index] = string1[k];
                    index++;

//                    System.out.print(string1[k] + " ");
                }
                if (isContains(subString, string2)) {
                        if (index < size) {
                            size = index;
                            start = i;
                            end = j;
                        }
                    for (int x = i; x <= j; x++) {
                        System.out.print(" " + string1[x]);
                    }
                }
                System.out.println();
            }
        }
        System.out.println("Finial String size   "+size);
        for (int i=start;i<=end;i++) {
            System.out.print(" "+string1[i]);
        }
        System.out.println();
    }

    static boolean isContains(String subString[], String[] string2) {
        if (subString.length >= string2.length) {
            for (int i = 0; i < string2.length; i++) {
                if (!isContainInSubstring(subString, string2[i])) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    static boolean isContainInSubstring(String subString[], String string2) {
        for (int i = 0; i < subString.length; i++) {
            if (subString[i] == string2) {
                subString[i] = ".";
                 return true;
            }
        }
        return false;
    }
}
