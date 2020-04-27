package com.srinivas.smartinterview.week11;

import java.util.LinkedList;

public class Graph {
    static int v;
    static LinkedList<Integer> adjList[];

    public Graph(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    static void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    static void printGraph() {
        for (int i = 0; i < v; i++) {
            LinkedList<Integer> adjNodes = adjList[i];
            for (Integer adjNode : adjNodes) {
                System.out.println("Adj nodes of: "+i+" = "+adjNode);
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
        printGraph();

    }
}
