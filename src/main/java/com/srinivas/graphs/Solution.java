package com.srinivas.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static class Subset {
        int parent;
        int weight;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputStream.readLine();
        String arr[] = firstLine.split(" ");
        int N = Integer.parseInt(arr[0]);
        int Q = Integer.parseInt(arr[1]);
        String[][] input = new String[Q][3];
        int index = 0;
        while (index < Q) {
            String line = inputStream.readLine();
            arr = line.split(" ");
            input[index][0] = arr[0];
            input[index][1] = arr[1];
            if (arr[0].equals("M")) {
                input[index][2] = arr[2];
            }
            index++;
        }

        Subset[] subsets = new Subset[N + 1];
        for (int i = 0; i <= N; i++) {
            subsets[i] = new Subset();
            subsets[i].parent = i;
            subsets[i].weight = 1;
        }

        for (int i = 0; i < index; i++) {
                if (input[i][0].equals("Q")) {
                  int parent = find(subsets, Integer.parseInt(input[i][1]));
                    System.out.println(subsets[parent].weight);
                } else if (input[i][0].equals("M")) {
                    union(subsets, Integer.parseInt(input[i][1]), Integer.parseInt(input[i][2]));
                }
            }
    }

    private static int find(Subset[] subsets, int member) {
        if (subsets[member].parent != member) {
            subsets[member].parent = find(subsets, subsets[member].parent);
        }
        return subsets[member].parent;
    }

    private static void union(Subset[] subsets, int c1, int c2) {
        int parentC1 = find(subsets, c1);
        int parentC2 = find(subsets, c2);
            subsets[parentC2].parent = parentC1;
            subsets[parentC1].weight++;
    }
}
