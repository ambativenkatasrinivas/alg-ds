package com.srinivas.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> finalGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade > 37) {
                int ld = grade % 10;
                switch (ld) {
                    case 0:
                        finalGrades.add(grade);
                        break;
                    case 1:
                        finalGrades.add(grade);
                        break;
                    case 2:
                        finalGrades.add(grade);
                        break;
                    case 3:
                        finalGrades.add(grade + 2);
                        break;
                    case 4:
                        finalGrades.add(grade + 1);
                        break;
                    case 5:
                        finalGrades.add(grade);
                        break;
                    case 6:
                        finalGrades.add(grade);
                        break;
                    case 7:
                        finalGrades.add(grade);
                        break;
                    case 8:
                        finalGrades.add(grade + 2);
                        break;
                    case 9:
                        finalGrades.add(grade + 1);
                        break;
                }
            } else {
                finalGrades.add(grade);
            }
        }
        return finalGrades;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        result.forEach(i -> System.out.println(i));

//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );

        bufferedReader.close();
        //      bufferedWriter.close();
    }
}
