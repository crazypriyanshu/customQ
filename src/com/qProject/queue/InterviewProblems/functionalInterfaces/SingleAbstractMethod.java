package com.qProject.queue.InterviewProblems.functionalInterfaces;

public class SingleAbstractMethod {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("working ... ");
        new Thread(r).start();
    }
}
