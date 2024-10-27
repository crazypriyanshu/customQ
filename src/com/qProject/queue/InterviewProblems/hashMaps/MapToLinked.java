package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.*;
import java.util.stream.Collectors;

public class MapToLinked {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 200);
        map.put("USA", 300);
        map.put("China", 100);
        map.put("UK", 150);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: list){
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(linkedHashMap.toString());

        Map<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }
}
