package com.qProject.queue.InterviewProblems.arrays.prefixSum;

public class RangeSumQuery {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] ansArray = new long[B.length];
        long[] prefixSum = new long[A.length];

        for(int i = 0; i < A.length; i++){
            if(i == 0){
                prefixSum[i] = A[i];
            } else{
                prefixSum[i] = prefixSum[i-1] + A[i];
            }
        }
        // sum of elements from L to R
        for (int i = 0; i < B.length; i++){
            long sum = 0;
            int L = B[i][0];
            int R = B[i][1];
            if (L == 0){
                sum = prefixSum[R];
            } else {
                sum = prefixSum[R] - prefixSum[L-1];
            }
            ansArray[i] = sum;
        }
        return ansArray;
    }
}
