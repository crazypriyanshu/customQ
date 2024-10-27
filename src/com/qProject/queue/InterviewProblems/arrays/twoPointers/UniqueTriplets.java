package com.qProject.queue.InterviewProblems.arrays.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Given an integer array, find all unique triplets that sum up to zero.
public class UniqueTriplets {
    public List<List<Integer>> threeSum(int[] num){
        List<List<Integer>> res = new ArrayList<>();
        for (int i=0; i < num.length-2; i++){
            if( i> 0 && num[i] == num[i-1]){
                continue; // skipping duplicates
            }

            int left = i+1, right = num.length-1;
            int sum = num[i]+num[left]+num[right];
            if (sum == 0){
                res.add(Arrays.asList(num[i], num[left], num[right]));
                while (left < right && num[left] == num[left+1]) left++;
                while (left < right && num[right] == num[right-1]) right--;
                left++;
                right--;

            } else if (sum < 0) {
                left++;

            } else {
                right--;
            }
        }
        return res;
    }
}
