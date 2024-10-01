package com.qProject.queue.InterviewProblems.graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopologicalSort {
    public static void main(String[] args) {
        int A = 6;
        int[][] B = { {6, 3}, {6, 1}, {5, 1}, {5, 2}, {3,4}, {4,2}};
        System.out.println(solve(A, B));

    }

    public static int[] solve(int A, int[][] B) {
        List<List<Integer>> graph = new ArrayList<>();
        int[] inDegree = new int[A+1];
        // create graph
        for(int i=0; i<= A; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] edge: B){
            int from = edge[0];
            int to = edge[1];
            graph.get(from).add(to);
            inDegree[to]++;
        }
        // use a priority queue
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=1; i<= A; i++) {
            if (inDegree[i] == 0){
                queue.add(i);
            }
        }
        int count = 0;
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()){
            int curr = queue.poll();
            count++;
            res.add(curr);

            for (int neighbour: graph.get(curr)){
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }
        if (res.size() != A){
            return new int[0];
        }

        int[] topologicalOrder = new int[res.size()];
        for (int i=0; i< res.size(); i++) {
            topologicalOrder[i] = res.get(i);
            System.out.print(res.get(i) + "  :: ");
        }
        return topologicalOrder;
    }
}
