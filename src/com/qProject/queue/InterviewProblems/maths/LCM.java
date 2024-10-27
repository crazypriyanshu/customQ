//package com.qProject.queue.InterviewProblems.maths;
//
//import java.util.Scanner;
//
//public class LCM {
//    // Write a program to input an integer T and then for each test case input two integers
//    // A and B in two different lines and then print T lines containing Least Common Multiple (LCM)
//    // of two given 2 numbers A and B.
//    //
//    //Note: LCM of two integers is the smallest positive integer divisible by both.
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        int counter;
//        for(int tc = 1; tc <= T; tc++){
//            int A = sc.nextInt();
//            int B = sc.nextInt();
//
//            int bigNum = A > B ? A:B;
//            counter = bigNum;
//
//            while(!(counter % A == 0 && counter % B == 0)){
//                counter += bigNum;
//            }
//            System.out.println(counter);
//
//        }
//
//    }
//}
