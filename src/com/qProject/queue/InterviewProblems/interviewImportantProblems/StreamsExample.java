package com.qProject.queue.InterviewProblems.interviewImportantProblems;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsExample {
    public static void main(String[] args) {
        // write a method to reverse a string
        Stream<String> stream = Stream.of("i love india");
        String input = "challenge";
        String reversed = IntStream.range(0, input.length())
                .mapToObj(i -> input.charAt(input.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println(reversed);

    }
}
