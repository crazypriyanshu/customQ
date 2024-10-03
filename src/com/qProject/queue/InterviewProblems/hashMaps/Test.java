package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static String getMaxOccurence(ArrayList<String> list) {
        HashMap<String, Integer> myMap = new HashMap<>();
        for(String s: list){
            myMap.put(s, myMap.getOrDefault(s, 0)+1);
        }
        String maxString = null, minString = null;
        int maxCount = Integer.MIN_VALUE, minCount = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry: myMap.entrySet()) {
            int count = entry.getValue();
            if(count > maxCount){
                maxCount = count;
                maxString = entry.getKey();
            }
            if(count < minCount){
                minCount = count;
                minString = entry.getKey();
            }
        }
        System.out.println("Max "+ maxString + " num "+ maxCount);
        System.out.println("Min "+ minString + " num "+ minCount);
        return maxString;
    }
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>(List.of("Pr", "Sh", "Pr", "Ij", "Pr", "Ij", "Shiva", "Rama", "Ganesh", "Laxman", "Sita" ));
        getMaxOccurence(values);




    }
}
