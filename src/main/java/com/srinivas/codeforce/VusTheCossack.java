package com.srinivas.codeforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VusTheCossack {

    public static void main(String[] args) throws IOException {
        VusTheCossack vusTheCossack = new VusTheCossack();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = inputStream.readLine();
        String arr[] = firstLine.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        ArrayList<Integer> graph[] = new ArrayList[n + 1];
        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < m; i++) {
            String line = inputStream.readLine();
            String[] edge = line.split(" ");
            int src = Integer.parseInt(edge[0]);
            int dest = Integer.parseInt(edge[1]);
            if (m == n&&i == 4) {
                graph[dest].add(src);
            } else {
                graph[src].add(dest);
            }
//            graph[src].add(dest);
        }

        int fe = vusTheCossack.applyVusTheCossack(graph, n, m);
        System.out.println(fe);
        vusTheCossack.print(graph);
    }

    int applyVusTheCossack(ArrayList<Integer> graph[], int n, int m) {

        int fe = m;
        for (int index = 1; index < graph.length; index++) {
            int di = graph[index].size();
            int fi = 0;
            Iterator<Integer> itr = graph[index].iterator();
            List<Integer> temp = new ArrayList<>();
            while (itr.hasNext()) {
                if (fi >= di / 2) {
                    break;
                }
                temp.add(itr.next());
                fe--;
                fi++;
            }
            for (int edge : temp) {
                graph[index].remove(new Integer(edge));
            }
        }
        return fe;
    }

    void print(ArrayList<Integer> graph[]) {
        for (int index = 1; index < graph.length; index++) {
            Iterator itr = graph[index].iterator();
            while (itr.hasNext()) {
                System.out.println(index + " " + itr.next());
            }
        }
    }
}
