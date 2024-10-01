package com.qProject.queue.InterviewProblems.misc;

import java.util.*;

//Given a dictionary of words, determine if a target word can be constructed by concatenating words from the dictionary.
// This problem requires an efficient recursive solution with memory optimization to handle large input sizes.
public class WordConcatenation {
    // function to check if the target word can be constructed from dictionary of words
    public static boolean canConstruct(String target, Set<String> dict, Map<String, Boolean> memo) {
        // check if result is already computed
        if(memo.containsKey(target)) return memo.get(target);
        //base case
        if(target.isEmpty()) return true;
        // try all prefix of the target
        for(int i=1; i< target.length(); i++){
            String prefix = target.substring(0,i);
            if (dict.contains(prefix)) {
                String suffix = target.substring(i);
                if(canConstruct(suffix, dict, memo)){
                    memo.put(target, true);
                    return true;
                }
            }
        }
        // if no prefix suffix split works, store and return false
        memo.put(target, false);
        return false;
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("cat", "cats", "and", "sand", "up");
        Set<String> dict = new HashSet<>(wordList);
        String target = "catsandup";
        // memoization map
        Map<String, Boolean> memo = new HashMap<>();
        boolean res = canConstruct(target, dict, memo);
        System.out.println(res);
    }
}
