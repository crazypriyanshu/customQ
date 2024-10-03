package com.qProject.queue.InterviewProblems.hashMaps;

import java.util.*;

public class MinToToProcess {
    public static int minTimeToProcessTask(int[] taskMemory, int[] taskType, int max_memory) {
        Map<Integer, List<Integer>> taskMap = new HashMap<>();
        // step 1: group tasks by their type
        for(int i=0; i < taskType.length; i++){
            taskMap.computeIfAbsent(taskType[i], k-> new ArrayList<>()).add(taskMemory[i]);
        }
        int tot_time = 0;


        // step2 : for each task type, sort the memory required and try to pair them
        for (List<Integer> memories: taskMap.values()) {
            Collections.sort(memories);
            int i = 0;
            int j = memories.size() -1;
            while(i <= j){
                // in case if only 1 task is left, process it individually and break
                if( i == j ){
                    tot_time += 1;
                    break;
                }
                // case when 2 memory can be processed together
                if (memories.get(i) + memories.get(j) <= max_memory){
                    tot_time += 1;
                    i++;
                    j--;
                } else {
                    // process the larger task individually
                    tot_time += 1;
                    j--;
                }
            }
        }

        // step 2:
        return tot_time;
    }

    public static void main(String[] args) {
        int[] task_memory = {5, 6, 7, 2, 3, 4, 5};
        int[] task_type = {1, 1, 1, 2, 2, 2, 2};
        int max_memory = 10;
        System.out.println(minTimeToProcessTask(task_memory, task_type, max_memory));

    }
}
