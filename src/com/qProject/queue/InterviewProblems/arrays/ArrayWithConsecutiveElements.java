package com.qProject.queue.InterviewProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayWithConsecutiveElements {
    // problem : Given an array of positive integers-return whether the array elements are consecutive or not
    // approach : sort the array and verify if each element is greater than next by 1, if not return 0, else 1

    public static void main(String[] args) {
        int[] A = {6, 4, 3, 2, 1};
        System.out.println(solveConsecutiveProblem(A));

    }

    public static int solveConsecutiveProblem(int[] arr) {
        return  IntStream.of(arr)
                .sorted()
                .reduce((a,b) -> (b-a== 1)?b:Integer.MIN_VALUE)
                .orElse(Integer.MIN_VALUE != Integer.MIN_VALUE ?1 :0);
    }
}
