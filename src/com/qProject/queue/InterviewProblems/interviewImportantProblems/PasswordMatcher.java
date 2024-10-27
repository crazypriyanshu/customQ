package com.qProject.queue.InterviewProblems.interviewImportantProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PasswordMatcher {
    private static final Pattern lowercaseMatcher = Pattern.compile("[a-z]");
    public static boolean validatePassword(String password){
        if (password == null || password.length() == 0){
            System.out.println("passwords cant be null");
        }
        if (!lowercaseMatcher.matcher(password).find()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String pass = "  ";
        System.out.println(validatePassword(pass));

        OptionalInt ans = IntStream.range(1,4).reduce((a, b) -> a+b);
        System.out.println(ans.getAsInt());

        int reducedParams = Stream.of(1, 2, 3)
                .reduce(10, (a, b) -> a + b, (a, b) -> {
                    return a + b;
                });
        System.out.println(reducedParams);

        List<String> list = Arrays.asList("abc1", "abc2", "abc3", "char");
        long size = list.stream().skip(1)
                .map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(size);

    }
}
