package com.qProject.queue.InterviewProblems.interviewImportantProblems;

import java.util.LinkedList;
import java.util.Queue;

// problem statement : you are given a 2D array, where 0 - empty cell, 1 - fresh orange, 2 - rotten orange
// each rotten orange can rot a fresh orange in 1 min - it can be right, left, top, bottom at any side
// task is to find min number of minutes that must elapse until no fresh orange remains or return -1(if its impossible to rot all the elements
public class RottenOranges {
    // directions for moving up, down, left, right
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    private static int rottingOrange(int[][] grid){
        if (grid == null || grid.length == 0){
            return -1;
        }
        int total_rows = grid.length;
        int total_cols = grid[0].length;

        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        for (int i=0; i < total_rows; i++){
            for (int j=0; j < total_cols; j++){
                if (grid[i][j] == 2){
                    queue.offer(new int[] {i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges += 1;

                }
            }
        }
        if (freshOranges == 0){
            return 0;
        }
        int minutes = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            boolean rotHappened = false;
            for(int i =0; i < size; i++){
                int[] orange = queue.poll();
                int row = orange[0];
                int col = orange[1];

                for (int[] direction: directions){
                    int newRow = row+ direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newRow < total_rows && newCol >= 0 && newCol < total_cols && grid[newRow][newCol] == 1){
                        grid[newRow][newCol] = 2;
                        freshOranges--;
                        queue.offer(new int[] {newRow, newCol});
                        rotHappened = true; // a fresh orange is rotten
                    }
                }
            }
            if (rotHappened) {
                minutes++;
            }
        }
        return freshOranges == 0 ? minutes : -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        System.out.println(rottingOrange(grid));
    }
}
