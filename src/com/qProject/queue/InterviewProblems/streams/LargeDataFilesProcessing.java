package com.qProject.queue.InterviewProblems.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LargeDataFilesProcessing {
    public static void main(String[] args) {
        System.out.println(System.getProperty("user.dir"));

        try (Stream<String> lines = Files.lines(Paths.get("C:/Users/Administrator/Documents/softwares/customQ/src/com/qProject/queue/InterviewProblems/streams/DataFiltering.java"))) {
            long count = lines.filter(line -> line.contains("String")).count();
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Stream<String> lines = Files.lines(Paths.get("C:/Users/Administrator/Documents/softwares/customQ/src/com/qProject/queue/InterviewProblems/streams/sequentialStreams.java"))) {
            List<String> numberOfseQuence = lines
                    .filter(line -> line.contains("stream"))
                    .map(String::toLowerCase)
                    .collect(Collectors.toList());
            System.out.println(numberOfseQuence.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
