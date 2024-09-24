package com.qProject.queue.InterviewProblems.tes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BReader {
    public static void main(String[] args) throws IOException {
//        char c;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println(" Press q to exit");
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');

        BufferedReader bufferedStringReader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println(" Enter lines of text ");
        System.out.println(" Enter 'stop' to quit ");
        do{
            s = bufferedStringReader.readLine();
            System.out.println(s);
        }while (!s.equals("stop"));


    }
}
