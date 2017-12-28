package com.org.io;

import java.io.FileWriter;

public class WriteAFile {
    public static void main(String[] args) {
        try{
            FileWriter wr=new FileWriter("Foo.txt");
            wr.write("hello world");
            wr.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
