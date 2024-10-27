package com.qProject.queue.InterviewProblems.interviewImportantProblems.BankProblem;

public class Bank {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(1000.0);
        Transaction transaction = new Transaction();

        Runnable r1 = () -> {
            for (int i=0; i< 100000; i++){
                transaction.process(account, 1.0, 1.0);
            }
        };

        Runnable r2 = () -> {
            for (int i=0; i< 100000; i++){
                transaction.process(account, 2.0, 2.0);
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance : $%.2f%n "+ account.getBalance());

    }
}
