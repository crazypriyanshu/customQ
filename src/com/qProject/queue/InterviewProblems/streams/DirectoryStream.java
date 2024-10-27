package com.qProject.queue.InterviewProblems.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStream {
    static void createDirectories() throws IOException {
        for (int i = 1; i <= 10; i++){
            Files.createDirectories(Path.of("./directory_"+i));

        }
    }

    public static void main(String[] args) throws IOException {
        createDirectories();
        var root = Path.of(".");
        Files.newDirectoryStream(root).forEach(System.out::println);
    }
}
