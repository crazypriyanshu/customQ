package com.qProject.queue.InterviewProblems.arrays;

public class MergeSort {
    private final static int MOD = 1000000007;

    public static int solve(int[] A){
        if(A == null || A.length < 2){
            return 0;
        }
        return mergeSortAndCount(A, 0, A.length-1);

    }

    public static int mergeSortAndCount(int[] A, int start, int end){
        if(start >= end){
            return 0;
        }
        int mid = (start + end)/2;
        int count = 0;
        count += mergeSortAndCount(A, start, mid);
        count += mergeSortAndCount(A, mid+1, end);
        count += mergeSortAndCount(A, start, end);
        return count%MOD;
    }

//    public static int merge(int[] A, int start, int mid, int end){
//        int[] left
//    }
    public static void main(String[] args) {

        int[] A = {1, 3, 2};
        System.out.println(solve(A));
    }
}
