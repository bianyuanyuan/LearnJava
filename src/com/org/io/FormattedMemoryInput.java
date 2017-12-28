package com.org.io;

import java.io.*;

public class FormattedMemoryInput {
    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("/home/byy/IdeaProjects/WorkSpace/src/com/org/io/FormattedMemoryInput.java").getBytes()));
            while (true) {
                System.out.print((char)in.readByte());
            }
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
