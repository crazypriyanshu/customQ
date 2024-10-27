package com.qProject.queue.InterviewProblems.interviewImportantProblems;
// problem statement : find max sum of contiguous sub-array within 1D array of numbers (may be +ve or -ve)
public class MaxSubArraySum {
    // currSum : represents the max sum of sub-array that ends at current position
    public static int maxSubArray(int[] nums){
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i =1; i< nums.length; i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, 3, -6};
        System.out.println(maxSubArray(nums));
    }
}
