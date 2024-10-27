package com.qProject.queue.InterviewProblems.arrays.stacks;

import java.util.Arrays;
import java.util.Stack;

// Given an array A, find the nearest smaller element G[i]
// for every element A[i] in the array such that the element has an index smaller than i.
//G[i] for an element A[i] = an element A[j] such that
//j is maximum possible AND j < i AND A[j] < A[i]
//Elements for which no smaller element exist, consider the next smaller element as -1.
public class NearestSmallerElement {
    public static int[] findNearestMin(int[] A){
        int[] ans = new int[A.length];
        int min_till_now = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<>();
        for (int i=0; i <A.length; i++){
            while (!stack.isEmpty() && stack.peek() >= A[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans[i] = stack.peek();
            }
            else {
                ans[i] = -1;
            }
            stack.push(A[i]);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] A = {34, 35, 7 , 16, 21, 90};
        int[] ans = new int[A.length];
        ans = findNearestMin(A);
        for (int i: ans){
            System.out.println(i);
        }
    }
}
