package com.qProject.queue.InterviewProblems.tes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("C");
        al.add("A");
        al.add("M");

        System.out.println("Original contents are:");

        Iterator<String> piterator = al.iterator();
        while (piterator.hasNext()) {
            String elem = piterator.next();
            System.out.println("Element "+ elem);
        }
        System.out.println();
        ListIterator<String> listI = al.listIterator();
        listI.add("Chaman");
        listI.add("Gaman");
        listI.add("Laman");
        while (listI.hasNext()) {
            String elem = listI.next();
            listI.set(elem+"@");
            System.out.println("after update : "+elem);
        }
        int counter = 0;
        while (listI.hasNext() || listI.hasPrevious()) {
            while (listI.hasNext() && counter < 6) {
                String elm = listI.next();
                System.out.println(elm);
                counter++;
            }
            while (listI.hasPrevious() && counter < 6) {
                String prev = listI.previous();
                System.out.println(prev);
                counter++;
            }

        }
    }
}
