package com.qProject.queue.InterviewProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxMod {
    // Given an array of size N, find the max value of A[i] % A[j]

    static int solveMaxmod(ArrayList<Integer> arr){
        int max1 = Integer.MIN_VALUE;
        for (int i=0; i < arr.size(); i++){
            for (int j=0; j < arr.size(); j++){
                if(arr.get(i) > 0 && arr.get(j) > 0){
                    int x = arr.get(i)%arr.get(j);
                    if(x > max1){
                        max1 = x;
                    }
                }
            }
        }
        return max1;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(5, 3, 3, 4));
        System.out.println(solveMaxmod(list));
    }
}
