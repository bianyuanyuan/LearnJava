package com.org.io;

import com.sun.org.apache.xerces.internal.impl.dtd.models.DFAContentModel;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

//static functions for reading and writing text files as a single string and treating a file as an ArrayList
public class TextFile extends ArrayList<String> {
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals(" ")) {
            remove(0);
        }
    }

    public TextFile(String fileName) {//Normally read by lines
        this(fileName, "\n");
    }

    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(fileName).getAbsolutePath()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    //write a single file in one method call
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile());
            try {
                for (String item : this) {
                    out.print(item);
                }
            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //test
    public static void main(String[] args) {
        String file=read("/home/byy/IdeaProjects/WorkSpace/src/com/org/io/TextFile.java");
        write("test.txt",file);
        TextFile txt=new TextFile("test.txt");
        txt.write("test2.txt");
        //Break into unique sorted list of words
        TreeSet<String> words=new TreeSet<String>(new TextFile("/home/byy/IdeaProjects/WorkSpace/src/com/org/io/TextFile.java","\\w+"));
        //Display the capitalized words
        System.out.println(words.headSet("a"));
    }
}
