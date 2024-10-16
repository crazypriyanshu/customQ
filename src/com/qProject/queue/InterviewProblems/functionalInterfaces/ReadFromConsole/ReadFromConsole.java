package com.qProject.queue.InterviewProblems.functionalInterfaces.ReadFromConsole;

public interface ReadFromConsole {
    public static void main(String[] args) {
        var console = System.console();
        console.printf(">>");
        var input = console.readLine();
        console.printf("echoing...  "+ input);
    }
}
