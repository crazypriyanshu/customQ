package com.qProject.queue.InterviewProblems.misc.customAnnotations;

import com.qProject.queue.InterviewProblems.misc.ImmutableClass;

public class ImmuteClient {
    public static void main(String[] args) {
        ImmutableClass immutableClass = new ImmutableClass(1, "Amit");
        int num = immutableClass.getId();
        String name = immutableClass.getName();
        System.out.println("Num "+num+" and name "+name);
        name = "vv";
        num = 4;
        System.out.println("Num "+immutableClass.getId()+" and name "+immutableClass.getName());
    }
}
