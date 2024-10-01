package com.qProject.queue.InterviewProblems.basics;

import java.util.HashMap;
import java.util.Map;

public class getFirstRepeated {
    public static void main(String[] args) {
        // find the first repeating char

    }

    public static Character getFirstChar(String s){
        //

        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i< s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), i);
            } else{
                return s.charAt(i);
            }

        }
        return 'n';
    }
}
