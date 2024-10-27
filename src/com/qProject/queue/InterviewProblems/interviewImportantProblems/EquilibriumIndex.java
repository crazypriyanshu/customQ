package com.qProject.queue.InterviewProblems.interviewImportantProblems;

// equilibrium index problem, the goal is to find an index in an array such that the
// sum of the elements on the left of that index is equal to the sum of the elements on the right.
public class EquilibriumIndex {
    public static int findEquilibriumIndex(int[] arr){
        int totalSum = 0;
        int leftSum = 0;

        // step 1 : calculate the total sum
        for (int nums: arr){
            totalSum += nums;
        }

        // step 2: iterate through array to find the equilibrium index

        for (int i=0; i< arr.length; i++){
            int rightSum = totalSum - leftSum - arr[i];
            if(leftSum == rightSum){
                return i;
            }
            leftSum += arr[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(findEquilibriumIndex(arr));
    }
}
