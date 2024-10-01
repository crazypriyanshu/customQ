package com.qProject.queue.InterviewProblems.learnAsync;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class SampleTest {
    public static String fetch(String path) throws IOException {
        try {
            return Files.readString(Path.of(path));
        } catch (Exception e){
            throw new RuntimeException("something is wrong: "+e.getMessage());
        }

    }

    public static CompletableFuture<String> fetchAsync(String path) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                return fetch(path);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static Void handleException(Throwable throwable){
        System.out.println("ERROR : "+ throwable);
        return null;
    }
    public static void main(String[] args) {
//        var names = List.of("Amy", "Penny", "Sheldon", "Raj", "Howard", "Leonard");
//        names.stream()
//                .parallel() // now this becomes parallel
//                .filter(name -> name.length() > 3)
//                .map(String::toUpperCase)
//                .forEach(System.out::println);
        fetchAsync("SampleTest.java")
                .thenApply(text -> text.length())
                .thenAccept(System.out::println)
                .exceptionally(err -> handleException(err))
                .join();

    }
}
