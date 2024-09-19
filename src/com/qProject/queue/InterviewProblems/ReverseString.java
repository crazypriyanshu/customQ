package com.qProject.queue.InterviewProblems;

public class ReverseString {
    public static String reverseWords(String A) {
        A = A.trim();
        String[] words = A.split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1; i>= 0; i--) {
            res.append(words[i]);
            if(i != 0) {
                res.append(" ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String input = " This is a bright sunny day";
        String out = reverseWords(input);
        System.out.println(out);
        String chand = reverseString(input);
        System.out.println(chand);
        char[] ca = {'A', 'a', 'b'};
        System.out.println(to_upper(ca));
        System.out.println(to_lower(ca));

    }

    public static String reverseString(String A) {
        char[] s = A.toCharArray();
        int n = A.length();
        for(int i=0; i< n/2; i++) {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }

    public static char[] to_upper(char[] A) {
        int n = A.length;
        for(int i =0; i < n; i++) {
            if(A[i] >= 'a' && A[i] <= 'z') {
                A[i] = (char) (65 + (A[i] - 'a'));
            }
        }
        return A;
    }

    public static char[] to_lower(char[] A) {
        int n = A.length;
        for(int i=0; i < n; i++){
            if(A[i] >= 'A' && A[i] <= 'Z') {
                A[i] = (char) ( A[i] + 32);
            }
        }
        return A;
    }
}
