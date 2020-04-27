package com.srinivas.graphs;

import java.util.LinkedList;

/**
 * Sum of dependencies in a graph
 */
public class SOD {
    static class Graph {
        int V;
        //LinkedList<String> adjListGraph[];
        LinkedList<Integer> adjListGraph[];

        public Graph(int V) {
            this.V = V;
            adjListGraph = new LinkedList[V];
            for (int i = 0; i < V; i++) {
                adjListGraph[i] = new LinkedList<>();
            }
        }

        void addEdge(Graph graph, int src, int dest) {
            graph.adjListGraph[src-1].add(dest-1);
        }

        void sod(Graph graph) {
            System.out.println("Sum of dependencies in a graph");
            int total = 0;
            for (int i = 0; i < graph.V; i++) {
                total = total + graph.adjListGraph[i].size();
                System.out.println(i+1 + " -> " + graph.adjListGraph[i].size());
            }
            System.out.println("Total="+total);
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 4, 3);
        graph.addEdge(graph, 2, 3);
        graph.sod(graph);
    }

}
