package com.qProject.queue.InterviewProblems.graphs;

import java.util.*;

public class Max_depth {
    private ArrayList<Integer>[] adj;
    private int[] ans;
    private HashMap<Integer, ArrayList<Integer>> hm;
    private boolean[] visited;
    private Queue<int[]> queue;

    public void init(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {
        adj = new ArrayList[A+1];
        hm = new HashMap<>();
        queue = new LinkedList<>();
        visited = new boolean[A+1];
        int size = E.length;
        ans = new int[size];

        for (int i =0; i <= A; i++) {
            adj[i] = new ArrayList<>();
        }
        int l = B.length;
        for (int i = 0; i < l; i++) {
            int u = B[i];
            int v = C[i];
            adj[u].add(v);
            adj[v].add(u);
        }
    }

    private void bfs(int num, int[] D) {
        queue.add(new int[]{num, 0});
        visited[num] = true;
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            num = curr[0];
            int level = curr[1];
            int value = D[num-1];
            visited[num] = true;
            if(hm.containsKey(level)) {
                hm.get(level).add(value);
            } else {
                ArrayList<Integer> ls = new ArrayList<>();
                ls.add(value);
                hm.put(level, ls);
            }

            for (int neighbour: adj[num]) {
                if (!visited[neighbour]) {
                    queue.add(new int[]{neighbour, level+1});
                    visited[neighbour] = true;
                }
            }
        }
    }

    private void define(int[] E, int[] F) {
        int l = E.length;
        for (int i =0; i < l; i++) {
            int level = E[i];
            int atPar = F[i];
            level = level % hm.size();
            if (hm.containsKey(level)) {
                ArrayList<Integer> ls = hm.get(level);
                Collections.sort(ls);
                int ind = Collections.binarySearch(ls, atPar);
                if (ind < 0) {
                    ind = Math.abs(ind);
                    ind--;
                }
                if (ind >= ls.size()) {
                    ans[i] = -1;
                    continue;
                }
                ans[i] = ls.get(ind);
            }
        }
    }

    public static void main(String[] args) {
        int A = 7; // Number of nodes
        int[] B = {1, 1, 2, 2, 3, 3}; // Edges
        int[] C = {2, 3, 4, 5, 6, 7}; // Connected nodes
        int[] D = {10, 20, 30, 40, 50, 60, 70}; // Node values
        int[] E = {1, 2}; // Levels for queries
        int[] F = {15, 25};



    }
}
