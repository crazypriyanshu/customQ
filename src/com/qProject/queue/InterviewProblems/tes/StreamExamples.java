package com.qProject.queue.InterviewProblems.tes;


import java.util.ArrayDeque;
import java.util.EnumSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class StreamExamples {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        // add elements
        ts.add("A");
        ts.add(("Aa"));
        ts.add("Z");
        ts.add("D");
        ts.add("C");
        System.out.println(ts);
        System.out.println(ts.subSet("C", "Z"));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(500);
        pq.add(10);
        pq.add(13);
        pq.add(23);
        pq.add(2);
        System.out.println(pq);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(20);
        arrayDeque.add(30);
        arrayDeque.add(40);
        arrayDeque.add(5);
        System.out.println(arrayDeque);
        System.out.println("Peaking here: "+arrayDeque.peek());
        System.out.println(arrayDeque);
        System.out.println("Polling here: "+arrayDeque.poll());
        System.out.println(arrayDeque);
        arrayDeque.push(90);
        System.out.println("Pushed 90");
        System.out.println(arrayDeque);
        System.out.println("Popping out"+arrayDeque.pop());
        System.out.println(arrayDeque);
        while(arrayDeque.peek() != null){
            System.out.println("popping out "+ arrayDeque.pop());
        }

    }
}
