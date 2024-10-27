package com.qProject.queue.InterviewProblems.functionalInterfaces;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        var path = Path.of("hello/priyanshu/lost");
        Files.createDirectories(path);
    }
}
