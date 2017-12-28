package com.org.io;

import java.io.*;

public class TestEOF {
    public static void main(String[] args) {
        try{
            DataInputStream data=new DataInputStream(new BufferedInputStream(new FileInputStream("/home/byy/IdeaProjects/WorkSpace/src/com/org/io/TestEOF.java")));
            while (data.available()!=0){//judge if end the file
                System.out.print((char)data.readByte());
            }
            //data.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
