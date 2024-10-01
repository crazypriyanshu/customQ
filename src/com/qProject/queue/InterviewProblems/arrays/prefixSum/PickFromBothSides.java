package com.qProject.queue.InterviewProblems.arrays.prefixSum;

import java.util.ArrayList;
import java.util.List;

public class PickFromBothSides {
    // Problem : given an integer array A of size N
    // You have to perform B operations - in each operation we can either remove leftmost or rightmost element from A.
    // Find and return max possible sum of B elements that were removed by B operations

    // Eg : A= [5, -2, 3, 1, 2], B = 3
    // remove 5 from front and element 1, 2 from back -  so that we get 5+1+2 = 8

    public static int solvePickFromBoth(ArrayList<Integer> A, int B){
        int n = A.size();

        // calculate prefix sum
        int[] prefixSum = new int[n];
        prefixSum[0] = A.get(0);
        for(int i= 1; i< n; i++){
            prefixSum[i] = prefixSum[i-1]+A.get(i);
        }
        int[] suffixSum = new int[n];
        suffixSum[n-1] = A.get(n-1);
        for(int i= n-2; i > 0; i++){
            suffixSum[i] = suffixSum[i+1]+A.get(i);
        }
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i <= B; i++){
            int frontSum = (i == 0) ? 0: prefixSum[i-1];
            int backSum = (i == B) ? 0 : suffixSum[n - B+i];
            maxValue = Math.max(maxValue, frontSum+backSum);
        }
        return maxValue;

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5, -2, 3, 1, 2));
        int B = 3;
        System.out.println(solvePickFromBoth(arr, B));
    }
}
