package com.qProject.queue.InterviewProblems.graphs;
//*
// Given a unidirected graph having A nodes & M edges
// Also given matrix B of size M*2 where (B[i][0],B[i][1]) represents 2 nodes connected by an edge
//
// */


import java.util.ArrayList;

public class CycleDetection {

    public static int solve(int A, int[][] B) {
        ArrayList<Integer> graph[] = new ArrayList[A+1];
        for(int i=0; i< graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        //create an adjacency list first
        int edges = B.length;
        for (int i=0; i< edges; i++) {
            int x = B[i][0];
            int y = B[i][1];
            graph[x].add(y);
            graph[y].add(x);
        }

        boolean[] visited = new boolean[A+1];
        int c = 0;
        for(int i=0; i<A; i++){
            if (visited[i] == false) {
                c++;
                dfs(i, graph, visited);

            }
        }
        if (edges == A-c) {
            return 0;
        }
        return 1;
    }
    public static void dfs(int curr, ArrayList<Integer> graph[], boolean[] visited){
        visited[curr] = true;
        for(int i =0; i< graph[curr].size(); i++) {
            int vertex = graph[curr].get(i);
            if (visited[vertex] == false){
                dfs(vertex, graph, visited );
            }
        }
    }

    public static void main(String[] args) {
        int A = 5;
        int[][] B ={{1, 2}};
        System.out.println(solve(A, B));
    }

}
