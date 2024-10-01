package com.qProject.queue.InterviewProblems.sorting;

import java.util.Arrays;

public class kSmallest {
    public static void main(String[] args) {
        int[] A = {7, 10, 4, 3, 20, 15};
        int B1 = 3;
        System.out.println(kSmallestWithBSwaps(A, B1));
    }

    public static int kSmallestWithBSwaps(int[] A, int B){
        int n = A.length;

        // perform B swaps
        for(int i =0; i< n && B > 0; i++) {
            // find the position of smallest element in the remaining array(i to n-1)
            int minIndex = i;
            for(int j = i+1; j < n; j++) {
                if(A[j] < A[minIndex]) {
                    minIndex = j;
                }
            }
            // if min index is not equal to i, do a swap
            if(minIndex != i) {
                int temp = A[i];
                A[i] = A[minIndex];
                A[minIndex] = temp;
                B--;
            }
        }
        return A[B-1];
    }

    public static int anotherSolution(int[] A, int B){
        return Arrays.stream(A)
                .sorted()
                .limit(B)
                .boxed()
                .sorted((e1, e2) -> e2-e1)
                .findFirst()
                .get();
    }

    public boolean arrayWithConsecutive(int[] A) {
        int n = A.length;
        int max_val = A[0];
        int min_val = A[0];
        for(int i=0; i< n; i++){
            if(A[i] < min_val){
                min_val = A[i];
            }
            if(A[i] > max_val){
                max_val = A[i];
            }

        }
        if(max_val -min_val +1 != n){
            return false;
        }
        for (int i=0; i< n; i++){
            int index = Math.abs(A[i]) - min_val;
            if(A[index] < 0) {
                return false;
            }
            A[index] = -A[index];
        }
        for (int i= 0; i < n; i++) {
            A[i] = Math.abs(A[i]);
        }

        return true;
    }


}
