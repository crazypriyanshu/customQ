package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.*;

public class Challenge {
    public static int minTimeToProcessTask(int[] taskMemory, int[] taskType, int max_memory){
        int timeToProcess = 0;
        Map<Integer, List<Integer>> taskMap = new HashMap<>();
        for (int i=0; i< taskType.length; i++){
            taskMap.computeIfAbsent(taskType[i], val -> new ArrayList<Integer>() ).add(taskMemory[i]);
        }
        for (List<Integer> mem: taskMap.values()){
            Collections.sort(mem);
            int start = 0, end = mem.size()-1;
            while (start <= end){
                if(start == end){
                    timeToProcess += 1;
                    break;
                }
                if(mem.get(start)+ mem.get(end) <= max_memory){
                    start++;
                    end--;
                    timeToProcess += 1;
                } else {
                    // process bigger task
                    end--;
                    timeToProcess += 1;
                }
            }
        }
        return timeToProcess;
    }

    public static void main(String[] args) {
        int[] taskMemory = {1, 2, 3, 4, 5, 6};
        int[] taskType = {1, 1, 2, 1, 2, 1};
        int max_memory = 7;
        System.out.println(minTimeToProcessTask(taskMemory, taskType, max_memory));

    }
}
