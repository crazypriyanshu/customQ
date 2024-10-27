package com.qProject.queue.InterviewProblems.interviewImportantProblems.BankProblem;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;

    }

    public synchronized void deposit(double amount){
        balance += amount;

    }

    public synchronized void withDraw(double amount){
        if (balance > amount){
            balance -= amount;
        }
    }

    public double getBalance(){
        return this.balance;
    }
}


