package com.qProject.queue.InterviewProblems.streams;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IndexOfFoundWord {
    record IndexWord(int index, String val) {}

    static IndexWord splitLoop(String line){
        var pattern = Pattern.compile(" ");
        var words = pattern.split(line);
//        for (int index =0; index < words.length; index++){
//            if (words[index].length() > 3){
//                return new IndexWord(index, words[index]);
//            }
//        }
//        throw new NoSuchElementException("Not found");

        return IntStream.range(0, words.length)
                .filter(index -> words[index].length() > 3)
                .mapToObj(index -> new IndexWord(index, words[index]))
                .findFirst()
                .orElseThrow();
    }

    public static void main(String[] args) {
        String line = " It has a big line with main char";
        System.out.println(splitLoop(line));

        var ints = IntStream.range(1, 41).boxed().toList();
        System.out.println(ints);

        record Pair(int a, int b){}
        var resultLoop = IntStream.range(0, 4)
                .boxed()
                .flatMap(i -> IntStream.range(0, 4).mapToObj(j -> new Pair(i, j)))
                .toList();
        System.out.println(resultLoop);
    }
}
