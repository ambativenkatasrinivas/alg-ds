package com.srinivas.graphs;

import java.util.LinkedList;

public class GFG {

    static class Graph {
        int v;
        LinkedList<Integer> adjListArray[];

        public Graph(int v) {
            this.v = v;
            adjListArray = new LinkedList[v];
            for (int i = 0; i < v; i++) {
                adjListArray[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].add(dest);
        graph.adjListArray[dest].add(src);
    }

    static void printGraph(Graph graph) {
        System.out.println("Graph adj list");
        for (int v = 0; v < graph.v; v++) {
            System.out.print(v + " -> ");
            for (Integer vertex : graph.adjListArray[v]) {
                System.out.print(vertex + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }
}
