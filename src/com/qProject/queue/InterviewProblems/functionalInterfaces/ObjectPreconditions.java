package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.time.LocalDateTime;
import java.util.Objects;

public class ObjectPreconditions {
    static String error(){
        return "input please, now ... "+ LocalDateTime.now();
    }

    static void parameterPlease(String input){
        Objects.requireNonNull(input, ObjectPreconditions::error);
    }

    public static void main(String[] args) {

        parameterPlease("charlie");
        parameterPlease(null);
    }

}
