package com.qProject.queue.InterviewProblems.dp.DiceThrow;

import java.util.Arrays;

public class DiceThrow {
    // Given sum A, number of ways you can get that sum with dice roll[1-6]

    public static int solve(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        final int MOD = 1000000007;
        for(int i = 1; i < n; i++){
            dp[i] = 0;
            for (int j=1; j <= 6; j++){
                if (j <= i){
                    dp[i] = (dp[i] + dp[i-j])%MOD;
                }
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
