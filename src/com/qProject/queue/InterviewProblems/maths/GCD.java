package com.qProject.queue.InterviewProblems.maths;

public class GCD {
    public static int findGCD(int a, int b){
        int res = Math.min(a, b);
        while (res > 0){
            if(a%res == 0 && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int ans = findGCD(a, b);
        System.out.println(ans);
    }
}
