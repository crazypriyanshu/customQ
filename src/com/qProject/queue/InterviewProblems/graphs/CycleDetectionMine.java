package com.qProject.queue.InterviewProblems.graphs;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;

public class CycleDetectionMine {
    // to detect a cycle, we can use DFS
    // Steps - traverse the graph using DFS while keeping track of :
    // visited[] nodes - keeping track of which ones were visited
    // recstack[] keep track of nodes currently in DFS
    // if node is already visited and is already in recstack, then a backedge is detected - meaning cycle

    static ArrayList<ArrayList<Integer>> graph;
    static boolean[] visited;
    static boolean[] dfsPath;
    public static int solveCycleDetection(int A, int[][] B){
        graph = createGraph(A, B);
        visited = new boolean[A+1];
        dfsPath = new boolean[A+1];
        Arrays.fill(visited, false);
        Arrays.fill(dfsPath, false);
        for (int i=0; i<= A; i++){
            if (!visited[i]){
                if (isCyclic(i)) return 1;
            }
        }
        return 0;

    }

    public static boolean isCyclic(int source){
        visited[source] = true;
        dfsPath[source] = true;

        for (int i=0; i< graph.get(source).size(); i++) {
            int adjacentNode = graph.get(source).get(i);
            if(!visited[adjacentNode]){
                if(isCyclic(adjacentNode)){
                    return true;
                }
            } else if (dfsPath[adjacentNode]) {
                return true;
            }
        }
        dfsPath[source] = false;
        return false;
    }

    public static void main(String[] args) {
        int A = 7;
//        int[][] B = {{1,2},{4,1},{2,4},{3,4},{5,2},{1,3}};
        int[][] B = {{1,2},{2,3},{3,1},{2,4},{2,5},{2,7},{4,6},{5,6}};
        System.out.println(solveCycleDetection(A, B));

    }

    public static ArrayList<ArrayList<Integer>> createGraph(int A, int[][] B) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i=0; i<= A; i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i=0; i< B.length; i++){
            int from = B[i][0];
            int to = B[i][1];
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        return graph;

    }

}
