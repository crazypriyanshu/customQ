package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.util.stream.Stream;

public interface Sorry {
    public static void main(String[] args) {
        Stream.generate(() -> "Sorry Baby! ").limit(101).forEach(System.out::print);
    }
}
