package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.util.Scanner;

public class RunJavaAsShellScript {
    public static void main(String[] args) {
        System.out.println("hello, from priyanshu"+3);
        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Double ans = square(num);
        System.out.println("Square of num "+ans);
        System.out.println("Square root of num "+squareRoot(num));
    }

    private static double square(int num) {
        double square = Math.pow((double) num, 2.0);
        return square;
    }

    private static double squareRoot(int num) {
        double square = Math.sqrt((double) num);
        return square;
    }
}
