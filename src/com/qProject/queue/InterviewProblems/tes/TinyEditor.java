package com.qProject.queue.InterviewProblems.tes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TinyEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = new String[100];
        System.out.println(" Enter the lines of text");
        System.out.println(" Enter 'stop' to quit");
        // user can write 100 lines
        for (int i=0; i < 100 ; i++ ) {
            s[i] = br.readLine();
            if(s[i].equals("stop")) break;
        }
        System.out.println("\nHere is your file: ");
        // display lines
        for (int i=0; i<100; i++){
            if (s[i].equals("stop")) break;
            System.out.println(s[i]);
        }
    }
}
