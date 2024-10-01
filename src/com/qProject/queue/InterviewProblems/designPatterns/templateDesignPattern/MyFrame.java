package com.qProject.queue.InterviewProblems.designPatterns.templateDesignPattern;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.setVisible(true);
    }

    public void paint(Graphics graphics) {
        super.paint(graphics);
        String message = "I will rule";
        graphics.drawString(message, 100, 100);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame("Priyanshu's world");
    }
}
