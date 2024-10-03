package com.qProject.queue.InterviewProblems.arrays;

import java.util.*;

public class LargestNumber {
    // given a list of non-negative numbers, arrange them so that they form largest number
    // return the string format

    public static String createLargestNumberString(ArrayList<Integer> list){
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (""+o2+o1).compareTo(""+o1+o2);
            }
        });
        if (list.get(0) == 0){
            return "0";
        }
        StringBuffer ans = new StringBuffer();
        for (int num: list){
            ans.append(num);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(3, 30, 34, 5, 9));
        System.out.println(createLargestNumberString(myList));

    }
}
