package com.qProject.queue.InterviewProblems.basics;

import java.util.Locale;

public class StringExamples {
    public static void main(String[] args) {
        String s1 = new String("You can't change me");
        String s2 = new String("You can't change me");
        System.out.println(s1 == s2);

        String s3 = "You can't change me";
        System.out.println(s1 == s3);

        String s4 = "You can't change me";
        System.out.println(s3 == s4);

        String s5 = "You can't"+" change me";
        System.out.println(s4 == s5);

        String s6 = "You can't ";
        String s7 = s6+"change me";
        System.out.println(s4 == s7);

        final String s8 = "You can't";
        String s9 = s8+" change me";
        System.out.println(s4 == s9);
        StringBuffer sb = new StringBuffer();
        StringBuilder sb1 = new StringBuilder();
        char[] ch = {'j', 'a', 'v', 'a'};
        byte[] byAr = {1, 96, 97, 98, 99, 100, 127};


        String s = new String(); // creates an empty string object in heap and String constant pool
        String ss1 = new String("Read");
        String ss2 = new String(sb);
        String ss3 = new String(sb1);
        String ss4 = new String(ch);
        System.out.println(ss4);
        String ss5 = new String(byAr);
        System.out.println(ss5);


        // isEmpty()
        String sss1 = " ";
        System.out.println(sss1.isEmpty()); // false - because of space
        System.out.println(sss1.isBlank()); // true - because only spaces

        // number of chars in String
        String sss2 = "ABCDBMBM ";
        System.out.println(sss2.length()); // length() for Strings
        System.out.println(sss2.replace("BM", "$")); // replace method of String
        System.out.println(sss2.substring(2, 6)); // substring and not subString
        System.out.println(sss2.indexOf('m')); // which index this char is present or returns -1
        System.out.println(sss2.lastIndexOf('B'));
        System.out.println(sss2.toLowerCase());
        System.out.println(sss2.trim());


        String s11 = new String("Java");
        String s22 = s11.toLowerCase();
        String s33 = s11.toUpperCase();
        System.out.println(s11 == s22); // if input was java then true, else false
        System.out.println(s11 == s33); // if input was JAVA, then true, else false

        int[] arr = {10, 20, 40};
        System.out.println(arr.length); // length is for arrays


    }
}
