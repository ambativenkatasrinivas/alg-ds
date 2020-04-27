package com.srinivas.hackerrank.smartinterview.page11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class PathInAGraph {

    static class Graph {
        private int v;
        public LinkedList<Integer> adjList[];

        public Graph(int v) {
            adjList = new LinkedList[v+1];
            this.v = v;
            for (int i = 1; i <= v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjList[src].add(dest);
            adjList[dest].add(src);
        }

        public  boolean checkPath(boolean visited[], int src, int dest) {
            if (src == dest) {
                return true;
            }
            visited[src] = true;
            for (Integer integer : adjList[src]) {
                if (!visited[integer] && checkPath(visited, integer, dest)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        int t = Integer.parseInt(bufferedReader.readLine());
        int count = 1;
        while (t > 0) {
            stringBuffer.append("Test Case #"+count+":").append("\n");
            String[] nm = bufferedReader.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int tempm = m;
            Graph graph = new Graph(n);
            while (tempm > 0) {
                // To Graph creation
                String[] edge = bufferedReader.readLine().split(" ");
                graph.addEdge(Integer.parseInt(edge[0]),Integer.parseInt(edge[1]));
                tempm--;
            }
            int q = Integer.parseInt(bufferedReader.readLine());

            // To Check path
            while (q > 0) {
                boolean visited[] = new boolean[n+1];
                String[] edge = bufferedReader.readLine().split(" ");
                if (graph.checkPath(visited, Integer.parseInt(edge[0]), Integer.parseInt(edge[1]))) {
                    stringBuffer.append("Yes").append("\n");
                } else {
                    stringBuffer.append("No").append("\n");
                }
                q--;
            }
            t--;
            count++;
        }
        System.out.println(stringBuffer.toString());
    }
}
