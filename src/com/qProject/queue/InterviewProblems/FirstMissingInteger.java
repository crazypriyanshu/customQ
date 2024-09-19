package com.qProject.queue.InterviewProblems;

public class FirstMissingInteger {
    public static int firstMissingInteger(int[] arr) {
        int n = arr.length;
        // rearrange elements
        for(int i = 0; i<n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[i] != arr[arr[i]-1]){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
            }
        }

        // find first missing element
        for (int i=0; i< n; i++) {
            if(arr[i] != i+1) {
                return i+1;
            }
        }
        // if all positions are correct then the missing number is last
        return n+1;
    }

    public static void main(String[] args) {
        int[] myArr = {3, 4, -1, 1};
        int val = firstMissingInteger(myArr);
        System.out.println(val);
    }
}
