package com.qProject.queue.InterviewProblems.interviewImportantProblems;
// problem statement : given a 2D array, find the longest increasing path, you can move in 4 directions - right, left, up and down
public class LongestIncreasingPath {
    private int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    private int total_rows, total_cols;
    private int[][] memory;

    public int findLongestIncreasingPath(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return 0;
        }
        total_rows = matrix.length;
        total_cols = matrix[0].length;
        memory = new int[total_rows][total_cols];
        int maxPath = 0;

        for (int i =0; i < total_rows; i++) {
            for (int j =0; j < total_cols; j++){
                maxPath = Math.max(maxPath, dfs(matrix, i, j));
            }
        }
        return maxPath;
    }

    public int dfs(int[][] matrix, int i, int j) {
        if (memory[i][j] != 0) return memory[i][j];
        int max = 1;
        for(int[] direction: directions){
            int newRow = i + direction[0];
            int newCol = j + direction[1];

            if(newRow < 0 || newCol < 0 || newRow >= total_rows || newCol >= total_cols || matrix[newRow][newCol] <= matrix[i][j]) {
                continue;
            } else {
                max = Math.max(max, 1+dfs(matrix, newRow, newCol));
            }
        }
        memory[i][j] = max;
        return max;
    }

    public static void main(String[] args) {
        LongestIncreasingPath longestIncreasingPath = new LongestIncreasingPath();
        int[][] matrix = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}
        };
        System.out.println("Longest increasing path "+ longestIncreasingPath.findLongestIncreasingPath(matrix));
    }
}
