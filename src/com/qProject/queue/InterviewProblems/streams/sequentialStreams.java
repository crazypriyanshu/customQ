package com.qProject.queue.InterviewProblems.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sequentialStreams {
    private int x;
    sequentialStreams(int x){
        x = x;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
//        nums.stream().forEach(num -> System.out.println(num + " "+ Thread.currentThread().getName()));
        nums.parallelStream().forEach(num -> System.out.println(num + " "+Thread.currentThread().getName()));

        List<Integer> evenNumbers = nums.stream().filter(i -> i%2 == 0).toList();
        System.out.println(evenNumbers);


    }
}
