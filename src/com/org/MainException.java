package com.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MainException {
    public static void main(String[] args) throws IOException {
        //open the file
        FileInputStream file = new FileInputStream("/home/byy/IdeaProjects/WorkSpace/src/com/org/MainException.java");
        //Use the file..
        //close the file
        file.close();
    }
}
