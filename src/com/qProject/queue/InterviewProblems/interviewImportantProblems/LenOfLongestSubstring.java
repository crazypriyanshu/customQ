package com.qProject.queue.InterviewProblems.interviewImportantProblems;

import java.util.HashSet;

public class LenOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int max_length = 0;
        int start = 0;

        for(int i = 0; i < s.length(); i++){
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(s.charAt(i));
            max_length = Math.max(max_length, i-start+1);
        }
        return max_length;
    }

    public static void main(String[] args) {
        String s = "abcdabc";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
