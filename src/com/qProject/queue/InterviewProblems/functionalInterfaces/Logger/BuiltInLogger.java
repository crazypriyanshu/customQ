package com.qProject.queue.InterviewProblems.functionalInterfaces.Logger;

public interface BuiltInLogger {
    public static void main(String[] args) {
        var log = System.getLogger("priyanshu");
        log.log(System.Logger.Level.INFO, "hello world from pdas");
        log.log(System.Logger.Level.WARNING, "warn : hello world from pdas");
        log.log(System.Logger.Level.DEBUG, "debug : hello world from pdas");
        System.out.println(" want to change the world to become a better place...");
    }
}
