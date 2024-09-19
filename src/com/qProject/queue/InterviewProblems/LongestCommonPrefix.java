package com.qProject.queue.InterviewProblems;
// problem statement : given an array of strings, find the longest string , which is prefix of all the strings in array
public class LongestCommonPrefix {
    public static String longestPrefix(String[] A) {
        if (A == null || A.length == 0){
            return "";
        }
        String prefix = A[0];
        for (int i =1; i< A.length; i++) {
            // compare the current prefix with the each string
            while (A[i].indexOf(prefix)!= 0) {
                // reducing the size of 1 character from the end
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty()) {
                    return "";
                }

            }
        }
        return prefix;

    }

    public static void main(String[] args) {
        String[] array = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix is : "+longestPrefix(array));
    }
}
