package com.qProject.queue.InterviewProblems.graphs;

import com.sun.source.tree.ArrayAccessTree;

import java.util.*;
import java.util.stream.IntStream;

public class Max_depth_mine {
    // given a tree node having A-1 edges and A nodes, each node is numbered from 1 to A.
    // We are given Q queries - each query gives us 2 integers L and X
    // find the value of such node which lies at level L%(max_depth+1) and has value >= X
    // answer to the query is smallest possible value or -1 (if all the values at required level are smaller than X
    // assumption : level and depth of the root is considered as 0
    // guaranteed that each edge will be connecting exactly 2 different nodes of the tree

    // A - number of nodes
    // B[i] and C[i] - nodes connected by an edge
    // D[i] - denotes the value of (i+1)th node
    // E[i] - denotes level (L)
    // F[i] - denotes the value (X)

    public static ArrayList<Integer> solveProblem(int A, ArrayList<Integer> B, ArrayList<Integer> C,ArrayList<Integer> D, ArrayList<Integer> E, ArrayList<Integer> F) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0; i<=A; i++){
            graph.add(new ArrayList<Integer>());
        }
        for (int i= 0; i < B.size(); i++){
            graph.get(B.get(i)).add(C.get(i));
            graph.get(C.get(i)).add(B.get(i));
        }
//        IntStream.range(0, B.size()).forEach(i -> {
//            graph.get(B.get(i)).add(C.get(i));
//            graph.get(C.get(i)).add(B.get(i));
//        });
        // our adjacency list is ready by now


        ArrayList<ArrayList<Integer>> list = new ArrayList<>(); // list to store level order traversal
        Boolean[] visisted = new Boolean[A+1];
        // initialized visited array
        for (int i=0; i<= A; i++){
            visisted[i] = false;
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visisted[1] = true;
        int depth = 0;

        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> tempList = new ArrayList<>();
            for(int i=0; i<n; i++){
                int x = q.remove();
                tempList.add(D.get(x-1)); // because the values are in D

                for (int j =0; j < graph.get(x).size(); j++) {
                    int neighbour = graph.get(x).get(j);

                    if(!visisted[neighbour]) {
                        q.add(neighbour);
                        visisted[neighbour] = true;
                    }
                }
            }
            Collections.sort(tempList);
            list.add(tempList);
            depth++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int i=0; i< E.size(); i++){
            int level = E.get(i) % depth;
            int res = findMinElement(list.get(level), F.get(i));
            ans.add(res);
        }

        return ans;
    }

    public static int findMinElement(List<Integer> list, int key) {
        int left = 0;
        int right = list.size()-1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (list.get(mid) >= key){
                ans = list.get(mid);
                right = mid-1;
            } else {
                left = mid +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int A = 5;
        ArrayList<Integer> B = new ArrayList<>(Arrays.asList(1, 4, 3, 1));
        ArrayList<Integer> C = new ArrayList<>(Arrays.asList(5, 2, 4, 4));
        ArrayList<Integer> D = new ArrayList<>(Arrays.asList(7, 38, 27, 37, 1));
        ArrayList<Integer> E = new ArrayList<>(Arrays.asList(1, 1, 2));
        ArrayList<Integer> F = new ArrayList<>(Arrays.asList(32, 18, 26));
        System.out.println(solveProblem(A, B, C, D, E, F));


    }
}
