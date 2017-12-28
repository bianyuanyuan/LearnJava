package com.org.io;
//Utility for reading files in binary form

import java.io.*;

public class BinaryFile {
    public static byte[] read(File bfile) throws IOException {
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(bfile));
        try {
            byte[] data = new byte[in.available()];//size
            in.read(data);
            return data;
        } finally {
            in.close();
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsolutePath());
    }
}
