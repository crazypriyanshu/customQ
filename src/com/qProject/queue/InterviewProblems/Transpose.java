package com.qProject.queue.InterviewProblems;

public class Transpose {
    public static void transpose(int[][] matrix) {
        // assuming matrix is always n*n
        int size = matrix.length;

        for (int row = 0; row < size; row++){
            for (int col = row+1; col < size; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }

        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(arr);

        for (int[] row : arr)
        { for (int element : row)
        { System.out.print(element + " ");
        } System.out.println(); }
    }
}
