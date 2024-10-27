package com.qProject.queue.InterviewProblems.basics;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        ImmutableClass t1 = new ImmutableClass(5);
        ImmutableClass t3 = t1.modify(5);
        ImmutableClass t2 =  t1.modify(4);
//        System.out.println(t1 == t3);
//        System.out.println(t2 == t3);

//        int count = 0;
//        Class c = Class.forName("java.lang.Object");
//        Method[] m = c.getDeclaredMethods();
//        for (Method m1: m){
//            count++;
//            System.out.println(m1.getName());
//        }
//        System.out.println(" Total methods : "+ count);
//        System.out.println(c);
    }
}
