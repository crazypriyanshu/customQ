package com.qProject.queue.InterviewProblems.dp;

import java.util.Scanner;

public class Fibonacci {


    public static int findFib(int N){
        if (N <= 1){
            return N;
        }
        int[] fib = new int[N+1];
        fib[0] = 0;
        fib[1] = 1;
        for (int i=2; i<= N; i++){
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib[N-1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n+"- th Fibonacci number is "+ findFib(n));
    }
}
