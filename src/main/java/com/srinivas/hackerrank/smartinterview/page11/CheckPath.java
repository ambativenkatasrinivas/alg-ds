package com.srinivas.hackerrank.smartinterview.page11;

public class CheckPath {

    public static boolean checkPath(PathInAGraph.Graph graph, boolean visited[], int src, int dest) {
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (Integer integer : graph.adjList[src]) {
            if (!visited[integer] && checkPath(graph, visited, integer, dest)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        PathInAGraph.Graph graph = new PathInAGraph.Graph(5);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 2);
        boolean visited[] = new boolean[5+1];
        System.out.println(checkPath(graph, visited, 1, 5));
        visited = new boolean[5+1];
        System.out.println(checkPath(graph, visited, 3, 4));
        visited = new boolean[5+1];
        System.out.println(checkPath(graph, visited, 4, 5));
        visited = new boolean[5+1];
        System.out.println(checkPath(graph, visited, 1, 4));
    }
}
