package com.qProject.queue.InterviewProblems.streams;

import java.util.regex.Pattern;

public class SplittingLine {
    static String splitStream(String line){
        var pattern = Pattern.compile(" ");
        return pattern.splitAsStream(line)
                .filter(word -> word.length() > 3)
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        String s = " I am a boy of 32 characters inside the moon lamp post ";
        System.out.println(splitStream(s));
    }
}
