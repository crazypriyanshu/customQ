package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.io.IOException;

public interface TerminalReset {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(" priyanshu is a nice guy");
        System.out.print("\033cls");
        System.out.flush();

    }
}

