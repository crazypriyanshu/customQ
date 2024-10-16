package com.qProject.queue.InterviewProblems.functionalInterfaces.staticInitializer;

public class StaticInitializer {
    static {
        System.out.println("first static bock");
    }
    static {
        System.out.println("2nd static bock");
    }

    public static void main(String[] args) {
        System.out.println("Now in Main ....");
    }
}
