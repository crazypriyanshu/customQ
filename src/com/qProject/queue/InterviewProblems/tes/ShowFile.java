package com.qProject.queue.InterviewProblems.tes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
        // first confirm if the file name has been specified
        if(args.length != 1){
            System.out.println("Usage: Show fileName");
            return;
        }
        // attempt to open a file
        try{
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println(" Cant open the file");
            return;
        }

        // at this point file is open and can be read
        try {
            do{
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            }while (i != -1);
        } catch (IOException e) {
            System.out.println("Error in reading the file");
        }

        // close the file
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Unable to close the file");
        }
    }
}
