package com.qProject.queue.InterviewProblems.strings;

import java.util.ArrayList;

public class BoringSubString {
    // given a string A of lowercase alphabets. Rearrange the characters of the given string A, such that there is no boring String
    // boring subString -
    // 1. its length is 2
    // both characters are consecutive(if the first character is C then next character can be C+1 or C-1
    // Return 1, if its possible to arrange the letters of A such that there are no boring substrings in A elase return 0


    public static int solveProb(String A) {
        int oddMax = Integer.MIN_VALUE;
        int oddMin = Integer.MAX_VALUE;

        int evenMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;

        for(int i=0; i < A.length(); i++) {
            int val = A.charAt(i) -'a'+1;
            if(val%2 != 0){
                oddMax = Math.max(oddMax, val);
                oddMin = Math.min(oddMin, val);
            } else {
                evenMax = Math.max(evenMax, val);
                evenMin = Math.min(evenMin, val);
            }
        }
        if(Math.abs(oddMin-evenMax) > 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        String s = "ajafafgja";
        System.out.println(solveProb(s));


    }
}
