package com.org.io;

import java.io.*;

public class MemoryInput {
    public static void main(String[] args) throws IOException{
        StringReader in=new StringReader(BufferedInputFile.read("/home/byy/IdeaProjects/WorkSpace/src/com/org/io/MemoryInput.java"));
        int c;
        while((c=in.read())!=-1) {
            System.out.print((char)c);
        }
    }
}