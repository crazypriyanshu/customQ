package com.qProject.queue.InterviewProblems.graphs;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

// Problem : Given a matrix of integers A of size N*M consisting of 0 or 1
// for each cell of matrix find the distance of nearest 1 in the matrix
// distance between 2 cells(x1,y1) and (x2, y2) is |x1-x2| + |y1-y2|
// find and return matrix B of size N*M which defines for each cell in A distance of nearest 1 in the matrix
// note that there is atleast one 1 present in the matrix
public class DistanceOfNearestCell {
    public static class Pair{
        int i;
        int j;
        public Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    public static int[][] solve(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int ans[][] = new int[n][m];
        // marking ans array all values with -1
        for(int i =0; i< n; i++){
            Arrays.fill(ans[i], -1);
        }

        Queue<Pair> queue = new ArrayDeque<>();
        // starting nodes are 1s == marking it distance 0 and push the node in the queue
        for(int i=0; i< n; i++){
            for(int j=0; j< m; j++) {
                if (A[i][j] == 1){
                    ans[i][j] = 0;
                    queue.add(new Pair(i,j));
                }
            }
        }
        //bfs
        while (!queue.isEmpty()){
            Pair p = queue.remove();
            int i = p.i;
            int j = p.j;

            if(checkValid(i-1, j, n, m) && ans[i-1][j] == -1){
                queue.add(new Pair(i-1, j));
                ans[i-1][j] = ans[i][j]+1;
            }

            if(checkValid(i+1, j, n, m) && ans[i+1][j] == -1){
                queue.add(new Pair(i+1, j));
                ans[i+1][j] = ans[i][j]+1;
            }

            if(checkValid(i, j-1, n, m) && ans[i][j-1] == -1){
                queue.add(new Pair(i, j-1));
                ans[i][j-1] = ans[i][j]+1;
            }

            if(checkValid(i, j+1, n, m) && ans[i][j+1] == -1){
                queue.add(new Pair(i, j+1));
                ans[i][j+1] = ans[i][j]+1;
            }
        }
        return ans;
    }

    public static boolean checkValid(int i, int j, int n, int m) {
        if(i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] A = {
                {0, 0, 0, 1},
                {0, 0, 1, 1},
                {0, 1, 1, 0}
     };
        int n = A.length;
        int m = A[0].length;
        int[][] ans = solve(A);

        for(int i =0; i< n; i++) {
            for (int j= 0; j< m; j++) {
                System.out.print(ans[i][j]+"    ");
            }
            System.out.println();
        }
    }


}


