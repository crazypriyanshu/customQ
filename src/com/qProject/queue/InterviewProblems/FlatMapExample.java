package com.qProject.queue.InterviewProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
//        List<String> words = Arrays.asList("Hello", "World");
//        List<Character> letters = words.stream()
//                .flatMap(word -> word.chars().mapToObj(c -> (char) c))
//                .collect(Collectors.toList());
//        System.out.println(letters);
//
//        List<Integer> nums = Arrays.asList(1, 2, 4, 9, 3, 21);
//
//        List<Integer> doubleNubers = nums.stream()
//                .map(n -> n*2)
//                .filter(n -> n > 4)
//                .collect(Collectors.toList());
//        System.out.println(doubleNubers);



        List<String> fruitsWord = Arrays.asList("apple", "banana", "cherry", "oranges");
        Map<String, String> myMap = System.getenv();
        for (Map.Entry<String, String> entry: myMap.entrySet()) {
            System.out.println(entry.getKey()+ " = "+entry.getValue());
        }

    }
}
