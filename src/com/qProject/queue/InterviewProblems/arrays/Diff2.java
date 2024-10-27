package com.qProject.queue.InterviewProblems.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Diff2 {

    public static int diffPossible(final List<Integer> A, int B){
        HashSet<Integer> set = new HashSet<>();
        for(Integer a: A){
            if(set.contains(a-B)){
                return 1;
            } else if (set.contains(a+B)) {
                return 1;

            } else{
                set.add(a);
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
