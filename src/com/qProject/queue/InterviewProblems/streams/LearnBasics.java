package com.qProject.queue.InterviewProblems.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LearnBasics {
    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 100000).boxed().toList();
        List<Integer> nums = list.parallelStream().filter(num -> num%2 == 0).map(Integer::intValue).collect(Collectors.toList());
        System.out.println(nums.stream().max(Integer::compareTo).get());
    }
}
