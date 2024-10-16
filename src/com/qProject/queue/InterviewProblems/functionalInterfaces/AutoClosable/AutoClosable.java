package com.qProject.queue.InterviewProblems.functionalInterfaces.AutoClosable;

public class AutoClosable implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Closing...");
    }

    public static void main(String[] args) {
        try {
            var a = new AutoClosable();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
