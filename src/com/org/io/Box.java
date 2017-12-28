package com.org.io;
//Test Serializable

import java.io.*;

public class Box implements Serializable {
    private int width;
    private int height;

    public void setWidth(int w) {
        width = w;
    }

    public void setHeight(int h) {
        height = h;
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        box.setHeight(69);
        box.setWidth(90);
        try {
            FileOutputStream fs = new FileOutputStream("Box.java");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(box);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        box1 = null;
        box2 = null;
        box3 = null;
        try {
            ObjectOutputStream is = new ObjectOutputStream(new FileOutputStream("Box.ser"));
            is.writeObject(box1);
            is.writeObject(box2);
            is.writeObject(box3);
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Box.ser"));
            Box one = (Box) inputStream.readObject();
            Box two = (Box) inputStream.readObject();
            Box three = (Box) inputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Pond implements Serializable {
    transient Duck duck = new Duck();//can not be serializable

    public static void main(String[] args) {
        Pond pond = new Pond();
        try {
            FileOutputStream fs = new FileOutputStream("Pond.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(pond);
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Duck {
}