package com.org.io;

import java.io.*;

public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));//input from keyboard
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {//show a line
            System.out.println(s);
        }
    }
}
