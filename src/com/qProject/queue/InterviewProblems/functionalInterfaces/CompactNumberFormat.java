package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.text.NumberFormat;

public class CompactNumberFormat {
    public static void main(String[] args) {
        var number = 100000;
        var f = NumberFormat.getCompactNumberInstance();
        var res = f.format(number);
        System.out.println(res);
    }
}
