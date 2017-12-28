package com.org.io;

import java.io.*;
import java.util.*;
import java.util.concurrent.TimeUnit;

//Transient
@SuppressWarnings("ALL")
public class Logon implements Serializable {
    private Date date = new Date();
    private String username;
    private transient String password;

    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "logon info:" + "\nusername:" + username + "\ndate:" + date + "\npassword:" + password;
    }

    public static void main(String[] args) throws Exception {//throws cannot be forget
        Logon a = new Logon("Huke", "yuan1208**");
        System.out.println("Logon a=" + a);
        ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Logon.out"));
        o.writeObject(a);
        o.close();

        TimeUnit.SECONDS.sleep(1);//delay 1s
        //now get them back
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Logon.out"));
        System.out.println("Recoving object at " + new Date());
        a = (Logon)in.readObject();
        System.out.println("Logon a=" + a);
    }
}
