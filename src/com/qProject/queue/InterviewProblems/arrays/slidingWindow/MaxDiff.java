package com.qProject.queue.InterviewProblems.arrays.slidingWindow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxDiff {
    public static int solveMaxDiff(int[] A, int B){
        int size = A.length;
        if (B == 0 || B > size){
            return 0;
        }
        Arrays.sort(A);
        int start = 0;
        int end = B-1;
        int ans = Integer.MAX_VALUE;
        while (end < size){
            int maxC = A[end];
            int minC = A[start];
            start++;
            end ++;
            ans = Math.min(ans, maxC - minC);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 9, 56, 7, 9, 12};
        int B = 5;
        System.out.println(solveMaxDiff(arr, B));
    }
}
