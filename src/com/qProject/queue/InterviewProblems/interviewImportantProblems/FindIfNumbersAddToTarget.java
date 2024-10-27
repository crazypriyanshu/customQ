package com.qProject.queue.InterviewProblems.interviewImportantProblems;
// Given a sorted array, find two numbers such that they add up to a specific target
public class FindIfNumbersAddToTarget {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while (left < right){
            int tempSum = numbers[left] + numbers[right];
            if (tempSum == target){
                return new int[]{left, right};
            } else if (tempSum < target) {
                left++;
            } else {
                right++;
            }
        }
        return new int[] {-1, -1};
    }
}
