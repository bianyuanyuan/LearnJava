package com.org.io;

import java.io.*;

public class StoringAndRecoveringData {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("data.txt")));
        out.writeDouble(12.5);
        out.writeBoolean(true);
        out.writeByte(12);
        out.writeBytes("how are you");
        out.writeUTF("Squre root of 2");
        out.close();
        DataInputStream in=new DataInputStream(new BufferedInputStream(new FileInputStream("data.txt")));
        System.out.println(in.readDouble());
        System.out.println(in.readBoolean());
        System.out.println(in.readByte());
        System.out.println(in.skipBytes(5));
        System.out.println(in.readUTF());
    }
}
