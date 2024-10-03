package com.qProject.queue.InterviewProblems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// problem : Given N set of time intervals, the task is to find the intervals
// which don’t overlap with the given set of intervals.
public class IntervalProblem {
    static class Interval{
        int start;
        int end;
        Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static void solveIntervalProblem(int[][] A){
        int size = A.length;
        ArrayList<Interval> list = new ArrayList<>();
        Arrays.sort(A, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for (int i=1; i< size; i++){
            int prevEnd = A[i-1][1];
            int currStart = A[i][0];
            if(prevEnd < currStart ){
                Interval interval = new Interval(prevEnd, currStart);
                list.add(interval);
            }

        }
        for (int i=0; i< size; i++){
            System.out.println("[ "+list.get(i).start+ " , "+ list.get(i).end+ " ]");
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 3 },
                { 2, 4 },
                { 3, 5 },
                { 7, 9 } };
        solveIntervalProblem(arr);
    }
}
