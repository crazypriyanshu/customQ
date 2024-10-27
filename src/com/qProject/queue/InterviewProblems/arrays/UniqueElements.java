package com.qProject.queue.InterviewProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//**
// You are given an array A of N elements.
// You have to make all elements unique.
// To do so, in one step you can increase any number by one.
//Find the minimum number of steps
// */
public class UniqueElements {
    public static int minSteps(ArrayList<Integer> A){
        Collections.sort(A);
        int count = 0;
        for(int i= 1; i< A.size(); i++){
            if(A.get(i) <= A.get(i-1)){
                int newVal = A.get(i-1)+1;
                count += (newVal - A.get(i));
                A.set(i, newVal);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(List.of(1, 1, 1, 1, 5, 6));
        System.out.println(minSteps(list));

    }
}
