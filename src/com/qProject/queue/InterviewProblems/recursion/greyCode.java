package com.qProject.queue.InterviewProblems.recursion;

import java.util.ArrayList;

public class greyCode {
    public static ArrayList<Integer> grayCode(int A){
        ArrayList<Integer> result = new ArrayList<>();
        int totalNumbers = 1 << A;
        for (int i=0; i< totalNumbers; i++) {
            result.add(i ^(i >> 1)); // grey code formulae
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(2));
        System.out.println(grayCode(3));
    }
}
