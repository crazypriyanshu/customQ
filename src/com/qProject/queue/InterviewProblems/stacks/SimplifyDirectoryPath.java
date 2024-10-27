package com.qProject.queue.InterviewProblems.stacks;

import java.util.Stack;

//*
// Given a string A representing an absolute path for a file (Unix-style). Return the string A after simplifying the absolute path.
//In Unix-style file system:
//
//A period '.' refers to the current directory.
//A double period '..' refers to the directory up a level.
//Any multiple consecutive slashes '//' are treated as a single slash '/'.
//
//In Simplified Absolute path:
//
//The path starts with a single slash '/'.
//Any two directories are separated by a single slash '/'.
//The path doesn't end with trailing slashes '/'.
//The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
//Path will not have whitespace characters.*/
public class SimplifyDirectoryPath {

    public static String simplifyPath(String A) {
        String path[] = A.split("/");
        Stack<String> st = new Stack<>();
        for (String p: path){
            if (!st.isEmpty() && p.equals("..")){
                st.pop();
            }
            if (!p.equals("..") && !p.equals("..") && !p.equals("")){
                st.push(p);
            }
        }

        StringBuilder s = new StringBuilder("/");
        Stack<String> result = new Stack<>();
        while (!st.isEmpty()){
            result.push(st.pop());
        }
        while (!result.isEmpty()){
            s.append(result.pop());
            s.append("/");
        }
        if (s.length() != 1){
            s.deleteCharAt(s.length()-1);
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String s = "abc/bcd";
        System.out.println(simplifyPath(s));
    }

}
