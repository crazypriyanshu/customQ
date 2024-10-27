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

    public static int merge(int[] A, int start, int mid, int end){
        int[] sorted = new int[end - start+1];
        int point1 = start, point2 = end, k=0;
        int inversionCount = 0;
        while(point1 <= mid && point2 <= end){
            if(A[point1] < A[point2]){
                sorted[k++] = A[point1++];
            } else {
                sorted[k++] = A[point2++];
                inversionCount += (mid - point1+1);
            }
        }
        while (point1 <= mid){
            sorted[k++] = A[point1++];
        }
        while (point2 <= end){
            sorted[k++] = A[point2++];
        }

        for (int i=0; i< sorted.length; i++){
            A[start+i] = sorted[i];
        }
        return inversionCount%MOD;
    }
    public static void main(String[] args) {

        int[] A = {1, 3, 2};
        System.out.println(solve(A));
    }
}
