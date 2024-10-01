package com.qProject.queue.InterviewProblems.streams;

import java.util.List;

public class test {
    static int x = 10;

    public static void main(String[] args) {
        test test1 = new test();
        test test2 = new test();
        test1.x = 20;
        System.out.println(test1.x+ " "+ test2.x);

        List<String> list = List.of("Apple", "Banana");
        list.stream().map(String::toUpperCase)
                .distinct()
                .forEach(System.out::println);
        System.gc();

    }
}
