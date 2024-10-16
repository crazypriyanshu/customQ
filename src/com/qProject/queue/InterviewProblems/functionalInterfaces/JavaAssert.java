package com.qProject.queue.InterviewProblems.functionalInterfaces;

public class JavaAssert {
    static void parameterNeeded(String input){
        assert input != null;
    }

    public static void main(String[] args) {
        parameterNeeded(null);
    }
}
