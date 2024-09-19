package com.qProject.queue.InterviewProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static int getSum(int a, int b, int[] c) {
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int n = c.length;

        for(int i=0; i< n; i++) {
            if(mp.containsKey(c[i])) {
                mp.replace(c[i], mp.get(c[i]), mp.get(c[i]) +1);
            }
            else {
                mp.put(c[i], 1);
            }
        }
        int flag =0, count = 0;
        for (Map.Entry<Integer, Integer> x: mp.entrySet()) {
            if(flag == 0 && x.getValue() == b) {
                flag = 1;
            }
            if (x.getValue() == b) {
                count += x.getKey();
            }
        }
        if (count == 0 && flag == 0) {
            count = -1;
        }
        return count;
    }


    public static String largestContinuousSequenceSumsToZero(String[] A) {
        int n = A.length;
        if(A == null || A.length == 0) {
            return "";
        }
        String prefix = A[0];
        for(int i = 0; i < n; i++) {
            // compare the current prefix with each string
            while (A[i].indexOf(prefix)!= 0){
                prefix = prefix.substring(0, prefix.length()-1);
                // if prefix becomes empty, return as no prefix found
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flowers", "fly"};
//        System.out.println(largestContinuousSequenceSumsToZero(arr));
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, -1, 4, -4));
        System.out.println(lsZero(input));
    }

    public static ArrayList<Integer> lsZero(ArrayList<Integer> A) {
        ArrayList<Integer> rst = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(A == null){
            return rst;
        }
        int len = 0, sum = 0, l =-1, r = -1;
        map.put(0, -1);
        for(int i=0; i<A.size(); i++) {
            sum += A.get(i);
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            else {
                if(i - map.get(sum) > len) {
                    l = map.get(sum) +1;
                    r = i;
                    len = i - map.get(sum);
                }
            }
        }
        if( l>= 0 && r >= 0){
            for (int i=0; i<= r; i++) {
                rst.add(i);
            }
        }
        return rst;
    }
}
