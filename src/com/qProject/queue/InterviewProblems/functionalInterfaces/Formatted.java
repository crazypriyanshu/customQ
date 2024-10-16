package com.qProject.queue.InterviewProblems.functionalInterfaces;

public class Formatted {
    public static void main(String[] args) {
        var message = """
                hey %s, You are older than  %d 
                from the way you show
                """.formatted("pri", 19);
        System.out.println(message);

    }
}
