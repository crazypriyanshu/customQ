package com.qProject.queue.InterviewProblems;

import java.util.ArrayList;
import java.util.List;

//*
// Given an directed graph having A nodes labelled from 1 to A
// containing M edges given by matrix B of size
// M x 2such that there is a edge directed from node
//B[i][0] to node B[i][1]
//Find whether a path exists from node 1 to node A.
//Return 1 if path exists else return 0
// A = 5 (meaning 5 nodes in graph)
// B = [
//      [1, 2],
//      [2, 3],
//      [3, 4],
//      [4, 5]
//      ]
// *//
public class Graphs {

    public static boolean ifPathAvailable(int A, int[][] B) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<= A; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(edge[1]);
        }
        boolean[] visited = new boolean[A+1];

        return dfs(1, A, adjList, visited);

    }

    public static boolean dfs(int node, int target, List<List<Integer>> adjList, boolean[] visited) {
        if (node == target){
            return true;
        }
        visited[node] = true;

        for (int neighbour: adjList.get(node)) {
            if (!visited[neighbour]) {
                if (dfs(neighbour, target, adjList, visited)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A = 5;
        int[][] B = {{1, 2},{2, 3},{3, 4},{4, 5},{5,9}};

        boolean flag = ifPathAvailable(A, B);
        System.out.println(flag);
    }

    // A = number of nodes, matrix B of size(M*2) -> there is edge from B[i][0] to B[i][1]
    public static boolean isCyclicGraph(int A, int[][] B) {
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i <= A; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        for(int[] edge: B) {
            adjList.get(edge[0]).add(edge[1]);
        }
        boolean[] visited = new boolean[A+1];
        boolean[] inDFS = new boolean[A+1];

        // run dfs on each node
        for(int i=0; i<= A; i++) {
            if(!visited[i]) {
                if (detectCycleDFS(i, adjList, visited, inDFS)) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean detectCycleDFS(int node, List<List<Integer>> adjList, boolean[] isVisited, boolean[] inDFS) {
        isVisited[node] = true;
        inDFS[node] = true;
        // visit all neighbours
        for(int neighbours: adjList.get(node)) {
            // if neighbour is a part of current dfs path, a cycle is present
            if(inDFS[neighbours]){
                return true;
            }
            if(!isVisited[neighbours]) {
                if(detectCycleDFS(neighbours, adjList, isVisited, inDFS)){
                    return true;
                }
            }
        }
        // mark the current node as no longer part of dfs path
        inDFS[node] = false;
        return false;
    }


}
