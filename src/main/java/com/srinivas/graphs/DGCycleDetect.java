package com.srinivas.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DGCycleDetect {
    int V;
    LinkedList<Integer> adjList[];

    public DGCycleDetect(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    private void addNode(int src, int dest) {
        adjList[src].add(dest);
    }

    public boolean isCycle() {
        for (int i = 0; i < V; i++) {
            boolean visited[] = new boolean[V];
            boolean recInStack[] = new boolean[V];
            if (isCycleUtil(i, visited, recInStack)) {
                return true;
            }
        }
        return false;
    }

    public boolean isCycleUtil(int s, boolean visited[], boolean recInStack[]) {
        if (recInStack[s]) {
            return true;
        }
        visited[s] = true;
        recInStack[s] = true;
        Iterator itr = adjList[s].iterator();
        while (itr.hasNext()) {
            int adj = (int) itr.next();
            if (isCycleUtil(adj, visited, recInStack) && visited[adj] ) {
                return true;
            }
        }

        recInStack[s] = false;
        return false;
    }

    public static void main(String[] args) {
        DGCycleDetect dgCycleDetect = new DGCycleDetect(6);
        dgCycleDetect.addNode(0,1);
        dgCycleDetect.addNode(0,2);
        dgCycleDetect.addNode(2,3);
        dgCycleDetect.addNode(3,4);
        dgCycleDetect.addNode(4,5);
        //dgCycleDetect.addNode(5,0);

        // dgCycleDetect.addNode(4,2);
        System.out.println(dgCycleDetect.isCycle());


    }
}
