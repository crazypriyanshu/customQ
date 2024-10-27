package com.qProject.queue.InterviewProblems.interviewImportantProblems.BankProblem;

public class Transaction {
    public void process(BankAccount account, double depositAmount, double withdrawAmount){
        synchronized (account) {
            account.deposit(depositAmount);
            account.withDraw(withdrawAmount);
        }
    }
}
