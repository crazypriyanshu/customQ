package com.qProject.queue.InterviewProblems.basics;

public class Test {
    public static void main(String[] args) {
        ImmutableClass t1 = new ImmutableClass(5);
        ImmutableClass t3 = t1.modify(5);
        ImmutableClass t2 =  t1.modify(4);
        System.out.println(t1 == t3);
        System.out.println(t2 == t3);
    }
}
