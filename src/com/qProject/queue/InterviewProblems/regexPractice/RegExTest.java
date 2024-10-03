package com.qProject.queue.InterviewProblems.regexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {
    public static void main(String[] args) {
        String literalMatch = "abc"; // matches "abc" exactly
        // meta characters
        String specialCharacter = "."; // matches any character
        String specialMoreThanOneOccurence = "*";
        String matchOneOrMoreCharacters = "+";
        String makesPrecedingElementOptional = "?";

        // character classes
        String matchAnyOfCharacters ="[abc]"; // matches any one of the character a, b or c
        String matchesAnyExceptCharacter = "[^abc]";
        String matchesAnyDigit = "\\d"; // matches any digit [0-9] actually its \d
        String matchesAnyNonDigitCharacter = "\\D"; // matches any non digit character.

        // Quantifiers
        String exactOccurrences = "a{3}"; // matches exact 3 occurrences of 'a'
        String inBetweenOccurrence = "a{2,4}"; // matches between 2 and 4 occurrences of a
        String matchesMoreThanZeroOccurrence = "a*";
        String matchesMoreThanOneOccurrence = "a+"; // matches more than 1 occurrence of `a`

        // Anchors

        String startOfLine = "^"; // matches the start of line
        String endOfLine = "$"; // matches end of the line

        // Groups and capturing
        String groupCapture = "(abc)"; // captures group abc
        String nonCapturingGroup = "(?abc)";  // non-capturing group

        // predefined classes
        String anyWordMatch = "\\w"; // matches any word character , alphanumeric or underscore
        String anyNonWord = "\\W"; // matches any non word character
        String whiteSpaceCharacter = "\\s"; // matches any whitespace character
        String anyNonWhiteSpaceCharacter = "\\S"; // matches any non white space characterr.

        String emailPattern = "^[A-Za-z0-9,_%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";


        Pattern pattern = Pattern.compile(endOfLine);
        Matcher matcher = pattern.matcher("1aa23abaacdaab90 \\/n jkk");
        while(matcher.find()){
            System.out.println(matcher.group());
        }

        String input = "sahib@34yy90090909090909090.com";
        boolean val = Pattern.matches(emailPattern, input);
        System.out.println(val);

        String phoneNumberInput = "909+990999";
        String phoneNumberPattern = "^\\d{10}$";
        System.out.println(Pattern.matches(phoneNumberPattern, phoneNumberInput));

        String urlMatcher = "^(http || https)://[A-Za-z0-9-._]+(:[0-9]+)?(/.*)?$";

    }
}

