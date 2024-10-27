package com.qProject.queue.InterviewProblems.interviewImportantProblems;

import java.util.LinkedList;
import java.util.Queue;

public class NewRottenOrangePractice {
    private static final int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};


    private static int rottingOrangesGame(int[][] matrix) {
        if (matrix == null || matrix.length == 0){
            return -1;
        }

        Queue<int[]> queue = new LinkedList<>();

        int total_rows = matrix.length;
        int tot_cols = matrix[0].length;
        int freshOranges = 0;
        for (int i=0; i< total_rows; i++){
            for (int j=0; j < tot_cols; j++){
                if (matrix[i][j] == 2){
                    queue.offer(new int[]{i, j});
                } else if (matrix[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0){
            return 0;
        }
        int minutes = 0;

        while (!queue.isEmpty()){
            // perform BFS
            int size = queue.size();
            boolean isRotten = false;
            for (int i =0; i < size; i++){
                int[] orange = queue.poll();
                int row = orange[0];
                int col = orange[1];

                for (int[] direction: directions){
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow >= 0 && newRow < total_rows && newCol >= 0 && newCol < tot_cols && matrix[newRow][newCol] == 1){
                        // now rot the oranges
                        matrix[newRow][newCol] = 2;
                        queue.offer(new int[]{newRow, newCol});
                        freshOranges--;
                        isRotten = true;

                    }
                }
            }
            if (isRotten){
                minutes++;
            }
        }
        return freshOranges == 0 ? minutes : -1;
    }
}
