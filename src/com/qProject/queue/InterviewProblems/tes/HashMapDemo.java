package com.qProject.queue.InterviewProblems.tes;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("Aman", 10);
        hm.put("Amar", 30);
        hm.put("Tilu", 50);
        System.out.println(hm);
        // get a set of entries
        Set<Map.Entry<String , Integer>> set = hm.entrySet();
        for (Map.Entry<String, Integer> me: set){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
        hm.put("Shalini", 10);
    }
}
