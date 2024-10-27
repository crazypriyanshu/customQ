package com.qProject.queue.InterviewProblems.stacks;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class SortAStack {
    public static int[] solve(int[] A){
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        for(int curr: A){
            while (!st1.isEmpty() && (st1.peek() < curr)){
                st2.push(st1.pop());
            }
            st1.push(curr);
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
        }
        int[] ans = new int[st1.size()];
        int i =0;
        while (!st1.empty()){
            ans[i++] = st1.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {7, 5, 11, 9};
        int[] ans = new int[A.length];
        ans = solve(A);
        for (int i: ans){
            System.out.println(i);
        }
    }
}
