package com.qProject.queue.InterviewProblems.functionalInterfaces.readFromClipBoard;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public interface ReadFromClipBoard {

    public static void main(String[] arg) throws IOException, UnsupportedFlavorException {
        var cb = Toolkit.getDefaultToolkit().getSystemClipboard();
        var content = cb.getData(DataFlavor.stringFlavor);
        System.out.println(content);
    }
}
