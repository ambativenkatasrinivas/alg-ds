package com.srinivas.hackerrank.smartinterview.page11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;

public class NumberOfIslandsEasy {

    private static boolean[] DFS(Graph graph, boolean visited[], int src) {
        Stack<Integer> stack = new Stack();
        if (!visited[src]) {
            stack.push(src);
            visited[src] = true;

            while (!stack.isEmpty()) {
                for (Integer integer : graph.adjList[stack.pop()]) {
                    if (!visited[integer]) {
                        stack.push(integer);
                        visited[integer] = true;
                    }
                }
            }

        }
        return visited;
    }

    private static int numberOfConnectedComponents(Graph graph, int v) {
        boolean visited[] = new boolean[v + 1];
        int componentCount = 0;
        for (int i = 1; i <= v; i++) {
            if (!visited[i]) {
                componentCount++;
                DFS(graph, visited, i);
            }
        }
        return componentCount;
    }

    static class Graph {
        private int v;
        public LinkedList<Integer> adjList[];

        public Graph(int v) {
            adjList = new LinkedList[v + 1];
            this.v = v;
            for (int i = 1; i <= v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjList[src].add(dest);
            adjList[dest].add(src);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        while (t > 0) {
//            stringBuffer.append("Test Case #"+count+":").append("\n");
            String[] rc = bufferedReader.readLine().split(" ");
            int r = Integer.parseInt(rc[0]);
            int c = Integer.parseInt(rc[1]);
            Graph graph = new Graph(getMax(c,r));
            for (int i = 0; i < r; i++) {
                char[] row = bufferedReader.readLine().toCharArray();
                for (int j = 0; j < c; j++) {
                    if (Integer.parseInt(row[j] + "") == 1) {
                        graph.addEdge(i + 1, j + 1);
                    }
                }
            }

//            int tempm = m;
//            Graph graph = new Graph(n);
//            while (tempm > 0) {
//                // To Graph creation
//                String[] edge = bufferedReader.readLine().split(" ");
//                graph.addEdge(Integer.parseInt(edge[0]), Integer.parseInt(edge[1]));
//                tempm--;
//            }
            //int q = Integer.parseInt(bufferedReader.readLine());

            // To Check path
//            while (q > 0) {
//                boolean visited[] = new boolean[n+1];
//                String[] edge = bufferedReader.readLine().split(" ");
//                if (graph.checkPath(visited, Integer.parseInt(edge[0]), Integer.parseInt(edge[1]))) {
//                    stringBuffer.append("Yes").append("\n");
//                } else {
//                    stringBuffer.append("No").append("\n");
//                }
//                q--;
//            }

            stringBuffer.append(numberOfConnectedComponents(graph, getMax(c,r))).append("\n");
            t--;
        }
        System.out.println(stringBuffer.toString());
    }

    private static int getMax(int a, int b) {
        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
