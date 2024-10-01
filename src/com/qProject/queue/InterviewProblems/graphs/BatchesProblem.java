package com.qProject.queue.InterviewProblems.graphs;

import java.util.HashMap;
import java.util.Map;

public class BatchesProblem {

     // Helper class to implement Union-Find (Disjoint Set Union)
    static class UnionFind {
        int[] parent, rank;

        // Initialize the parent and rank arrays
        public UnionFind(int n) {
            parent = new int[n];
            rank = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

            // Find with path compression
        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        // Union by rank
        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int A = 7;
        int[] B = {1, 6, 7, 2, 9, 4, 5};
        int[][] C = {{1, 2},{2, 3},{5,6},{5,7}};
        int D = 12;
        System.out.println(solve(A, B, C, D));


}

    public static int solve(int A, int[] B, int[][] C, int D) {
        UnionFind uf = new UnionFind(A);

        // Apply union operations based on the relationships given
        for (int[] relation : C) {
            int student1 = relation[0] - 1; // Convert to 0-based index
            int student2 = relation[1] - 1; // Convert to 0-based index
            uf.union(student1, student2);
        }

        // Map to hold the total strength of each batch (connected component)
        Map<Integer, Integer> batchStrengthMap = new HashMap<>();

        // Calculate the total strength for each connected component
        for (int i = 0; i < A; i++) {
            int root = uf.find(i);
            batchStrengthMap.put(root, batchStrengthMap.getOrDefault(root, 0) + B[i]);
        }

        // Count the number of selected batches based on the strength criteria
        int selectedBatches = 0;
        for (int strength : batchStrengthMap.values()) {
            if (strength >= D) {
                selectedBatches++;
            }
        }

        return selectedBatches;
    }
    }
