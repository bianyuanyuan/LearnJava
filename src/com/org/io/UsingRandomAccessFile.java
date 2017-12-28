package com.org.io;

import java.io.*;

public class UsingRandomAccessFile {
    static String file = "rtest.dat";

    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for (int i = 0; i < 9; i++) {
            System.out.println("value " + i + ":" + rf.readDouble());
        }
        System.out.println(rf.readUTF());
        rf.close();


    }

    public static void main(String[] args) throws IOException {
        RandomAccessFile rfw = new RandomAccessFile(file, "rw");
        for (int i = 0; i < 9; i++) {
            rfw.writeDouble(i * 3.14);
        }
        rfw.writeUTF("------End of the file-------");
        rfw.close();
        display();
        rfw = new RandomAccessFile(file, "rw");
        rfw.seek(5 * 8);//modify the 5th element
        rfw.writeDouble(78.1111);
        rfw.close();
        display();
    }
}
