package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.*;
import java.util.stream.Collectors;

public class practice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        ArrayList<String> values = new ArrayList<>(List.of("Pr", "Sh", "Pr", "Ij", "Pr", "Ij", "Shiva", "Rama", "Ganesh", "Laxman", "Sita" ));
        convertArrayToMapBasedOnOccurence(values);

    }

    public static void convertArrayToMapBasedOnOccurence(ArrayList<String> list) {
        HashMap<String, Integer> ansMap = new HashMap<>();
        // step 1 : add entries to hash map
        for(String s : list){
            ansMap.put(s.toLowerCase(), ansMap.getOrDefault(s.toLowerCase(), 0) + 1);
        }
        // loop through hashmap and print the entries
        Map<String, Integer> sortedMap = ansMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        sortedMap.forEach((key, val) -> System.out.println(key + " -> "+val));


    }
}
