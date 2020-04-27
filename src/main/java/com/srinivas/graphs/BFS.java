package com.srinivas.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class BFS {
    int V;
    LinkedList<Integer> adjList[];

    public BFS(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addNode(int src, int dest) {
        adjList[src].add(dest);
    }

    public void bfs(int s) {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(s);
        visited[s] = true;
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator itr = adjList[s].iterator();
            while (itr.hasNext()) {
                int adj = (int) itr.next();
                if (!visited[adj]) {
                    queue.add(adj);
                    visited[adj] = true;
                }
            }
        }
    }

    public void dfs(int s) {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];
        visited[s] = true;
        stack.push(s);
        visited[s] = true;
        while (!stack.isEmpty()) {
            s = stack.pop();
            System.out.print(s+" ");
            Iterator iterator = adjList[s].iterator();
            while (iterator.hasNext()) {
                int adj =(int) iterator.next();
                if (!visited[adj]) {
                    stack.push(adj);
                    visited[adj] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS g = new BFS(6);
        g.addNode(0, 1);
        g.addNode(0, 2);
        g.addNode(1, 3);
        g.addNode(1, 4);
        g.addNode(2, 0);
        g.addNode(2, 4);
        g.addNode(3, 4);
        g.addNode(3, 5);
        g.addNode(4, 1);
        g.addNode(4, 2);
        g.addNode(4, 3);
        g.addNode(4, 5);
        System.out.println("Following is Breadth First Traversal " +
                "(starting from vertex 2)");
        g.bfs(0);
        System.out.println();
        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 2)");
        g.dfs(0);

    }
}
