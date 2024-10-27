package com.qProject.queue.InterviewProblems.streams;

public class LineStrings {
    public static void main(String[] args) {
        var res = """
                great woork
                is wor_king
                but not now for
                the great work to do
                """.lines().filter(l -> l.contains("work")).findAny().orElse("Not found");
        System.out.println(res);
    }
}
