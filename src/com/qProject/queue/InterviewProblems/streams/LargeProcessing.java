package com.qProject.queue.InterviewProblems.streams;

import java.util.ArrayList;
import java.util.Random;

public class LargeProcessing {
    final static int MAX = 10_0000;
    public static int fun(int n){
        for (int i =1; i < MAX; i++){
            n = (n ^ i)% i;
            if(n <= 0){
                n = 10;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> data = new ArrayList<>();
        for (int i=0; i< MAX; i++){
            data.add(rand.nextInt());
        }
        System.out.println("Strating");
        int res = 0;
//        for(int i : data){
//            res += fun(i);
//        }
//        res = data.stream().map(i -> fun(i)).reduce(Integer::sum).get();
        res = data.parallelStream().map(i -> fun(i)).reduce(Integer::sum).get();
        // more core machines is good
        // multi core future, 3.0 GHz -> 2005
        // 4 core, 8 core, .... 256 cores machines

        System.out.println(res);
    }
}
