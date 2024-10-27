package com.qProject.queue.InterviewProblems.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ClassicUseCases {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 5, 1, 4, 2, 9);

        // finding min and max
        int min = numbers.stream().min(Integer::compareTo).get();
        int max = numbers.stream().max(Integer::compareTo).get();
        System.out.println(min + " : is min, "+ max+ " is max.");

        Integer first = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(first);
        // summing and averaging
//        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
//        System.out.println(sum + " sum");
//        double avg = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
//        System.out.println("average "+avg);
//        List<String> items = Arrays.asList("apple", "banana", "orange");
//
//        Map<String, Integer> map;
//        map = items.stream().collect(Collectors.toMap(item -> item, item -> item.length()));
//        System.out.println(map.toString());



    }
}
