package com.qProject.queue.InterviewProblems.arrays.twoPointers;

public class RemoveDuplicatesFromSortedArray {
    // given a sorted array, remove duplicates

    public static int removeDuplicates(int[] arr){
        if(arr == null || arr.length == 0) return 0;
        if(arr.length == 1){
            return 1;
        }
        int currLength = arr.length;
        for (int i=1; i< arr.length; i++){
            int currVal= arr[i];
            int prevVal = arr[i-1];
            if(prevVal == currVal){
                currLength--;
            }
        }
        return currLength;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }
}
