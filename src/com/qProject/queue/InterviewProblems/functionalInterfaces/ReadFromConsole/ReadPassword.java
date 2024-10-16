package com.qProject.queue.InterviewProblems.functionalInterfaces.ReadFromConsole;

public interface ReadPassword {
    public static void main(String[] args) {
        var console = System.console();
        var chars = console.readPassword("your password :> ");
        System.out.println(chars);
    }
}
