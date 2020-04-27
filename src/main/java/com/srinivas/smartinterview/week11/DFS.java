package com.srinivas.smartinterview.week11;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    static class Graph {
        int v;
        LinkedList<Integer>[] adjList;

        public Graph(int v) {
            this.v = v;
            adjList = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        public void addEdge(int src, int dest) {
            adjList[src].add(dest);
            adjList[dest].add(src);
        }
    }



    public static void dfs(Graph graph, int src) {
        boolean visited[] = new boolean[graph.v];
        Stack<Integer> stack = new Stack();
        stack.push(src);
        visited[src] = true;

        while (!stack.isEmpty()) {
            int tempNode = stack.pop();
            System.out.println(tempNode);
            for(int adjNode : graph.adjList[tempNode]) {
                if (!visited[adjNode]) {
                    visited[adjNode] = true;
                    stack.push(adjNode);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(4,3);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(3,2);
        dfs(graph, 0);
    }
}
