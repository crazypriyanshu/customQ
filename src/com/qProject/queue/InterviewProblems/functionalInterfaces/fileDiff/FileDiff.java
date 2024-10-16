package com.qProject.queue.InterviewProblems.functionalInterfaces.fileDiff;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public interface FileDiff {
    static void main(String... args) throws IOException {
        var first = Path.of("C:\\Users\\Administrator\\Documents\\softwares\\customQ\\src\\com\\qProject\\queue\\InterviewProblems\\functionalInterfaces\\fileDiff\\a.txt");
        var second = Path.of("C:\\Users\\Administrator\\Documents\\softwares\\customQ\\src\\com\\qProject\\queue\\InterviewProblems\\functionalInterfaces\\fileDiff\\b.txt");
        var firstDiff = Files.mismatch(first, second);
        System.out.println(firstDiff);
    }
}
