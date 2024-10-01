package com.qProject.queue.InterviewProblems.tes;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();
        vals.add(10);
        vals.add(20);
        vals.add(30);
        vals.add(15);
        System.out.println("contents of the value are : ");
        int sum = 0;
        for (int v: vals){
            sum += v;
            System.out.print(v + " ");
        }
        System.out.println("Sum "+sum);
    }
}
