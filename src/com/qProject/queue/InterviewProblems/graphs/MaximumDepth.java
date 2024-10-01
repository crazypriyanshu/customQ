package com.qProject.queue.InterviewProblems.graphs;

import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.stream.Collectors;

//*
// Given a Tree of A nodes having A-1 edges.
// Each node is numbered from 1 to A where 1 is the root of the tree.
//You are given Q queries. In each query, you will be given two integers L and X.
// Find the value of such node which lies at level L mod (MaxDepth + 1) and has value greater than or equal to X.
//Answer to the query is the smallest possible value or -1,
// if all the values at the required level are smaller than X.*/
public class MaximumDepth {
    // A - number of nodes, B[i] and C[i] are nodes connected by an edge
    // D[i] - denotes value of i+1th node
    // E[i] - L & F[i]  -X denotes x for ith query
    public static void max_depth(int A, int[] B, int[] C, int[] D, int[] E, int[] F) {
        // build an adjacency list to store tree


    }
    public static void main(String[] args) {
        int A = 7; // Number of nodes
        int[] B = {1, 1, 2, 2, 3, 3}; // Edges
        int[] C = {2, 3, 4, 5, 6, 7}; // Connected nodes
        int[] D = {10, 20, 30, 40, 50, 60, 70}; // Node values
        int[] E = {1, 2}; // Levels for queries
        int[] F = {15, 25}; // Values for queries

        // step1: build a tree
        TreeNode root = buildTree(A, B, C, D);
        // get levels of each node
        List<List<Integer>> levelNodes = getLevelNodes(root);

        for(int i=0; i< E.length; i++){
            int res = query(levelNodes, E[i], F[i]);
            System.out.println(res);
        }

    }

    public static class TreeNode {
        int value;
        List<TreeNode> children;
        TreeNode(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }

    public static TreeNode buildTree(int A, int[] B, int[] C, int[] D) {
        TreeNode[] nodes = new TreeNode[A+1];
        for(int i= 1; i<= A; i++){
            nodes[i] = new TreeNode(D[i-1]);
        }

        for(int i=0; i <B.length; i++) {
            nodes[B[i]].children.add(nodes[C[i]]);
            nodes[C[i]].children.add(nodes[B[i]]);
        }
        return nodes[1]; // return root node
    }

    private static List<List<Integer>> getLevelNodes(TreeNode root) {
        List<List<Integer>> levelNodes = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for(int i=0; i< size; i++) {
                TreeNode node = queue.poll();
                currentLevel.add(node.value);
                for (TreeNode child: node.children) {
                    queue.add(child);
                }
            }
            levelNodes.add(currentLevel);
        }
        return levelNodes;
    }

    public static int query(List<List<Integer>> levelNodes, int L, int X) {
        if (L >= levelNodes.size()) {
            return -1;
        }
        List<Integer> valuesAtLevel = levelNodes.get(L);
        Collections.sort(valuesAtLevel); // sort to find the smallest >= X
        for(int val: valuesAtLevel) {
            if (val >= X) {
                return val;
            }
        }
        return -1; // no valid node
    }
}

