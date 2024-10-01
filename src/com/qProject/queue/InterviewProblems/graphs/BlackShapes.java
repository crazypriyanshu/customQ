package com.qProject.queue.InterviewProblems.graphs;
//*
// Problem : Given a character matrix of N*M consisting of O's and X's, O = white and X = black
// Return the number of black shapes -> a black shape consists of 1 or more adjacent X's
// */
public class BlackShapes {
    private static int count = 0;
    private static boolean[][] marked;
    private static int[] di = new int[] {1, -1, 0, 0};
    private static int[] dj = new int[] {0, 0, 1, -1};
    private static String[] Aa;

    public static int solve(String[] A) {
        int m, n;
        if( A == null) {
            return 0;
        }
        m = A.length;
        n = A[0].length();

        marked = new boolean[m][n];
        count = 0;
        Aa =  A;

        for(int i=0; i < m; i++){
            for (int j=0; j< n; j++) {
                if(!marked[i][j] && A[i].charAt(j) == 'X') {
                    dfs(i, j, m, n);
                    count++;
                }
            }
        }
        return count;

    }

    public static void dfs(int i, int j, int m, int n) {
        marked[i][j] = true;
        for(int k=0; k < 4; k++) {
            int ii = i + di[k];
            int jj = j + dj[k];

            if(isValid(ii, jj, m ,n) && !marked[ii][jj]) {
                dfs(ii, jj, m, n);
            }
        }
    }

    public static boolean isValid(int i, int j, int m, int n){
        if(i<0 || j < 0 || i >= m || j >= n) {
            return false;
        }
        if(Aa[i].charAt(j) != 'X') {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] A = {"XXO", "XXO", "XXX"};
        int count = solve(A);
        System.out.println(count);
    }

}
