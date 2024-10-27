package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.io.IOException;
import java.nio.file.Files;

public class CreateTempFolder {
    public static void main(String[] args) throws IOException {
        var temp = Files.createTempDirectory("hack");
        System.out.println(temp);
    }
}
