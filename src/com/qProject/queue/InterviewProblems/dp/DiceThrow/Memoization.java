package com.qProject.queue.InterviewProblems.dp.DiceThrow;

import java.util.Arrays;
import java.util.Scanner;

public class Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[N+1];
        Arrays.fill(dp, -1);
        System.out.println(diceRoll(N, dp));

    }


    public static int diceRoll(int A, int[] dp){
        if (A == 0){
            return 1;
        }
        if (dp[A] == -1){
            int sum = 0;
            for (int i = 1; i<= 6; i++){
                if (A - i > 0){
                    sum = sum + diceRoll(A-i, dp);
                }
            }
            dp[A] = sum;
        }
        return dp[A];
    }
}
