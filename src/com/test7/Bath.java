package com.test7;

class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Bath {
    private String //initializing at point of descrition
            s1 = "hello",
            s2 = "hi",
            s3, s4;
    private Soap soap;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Bath()");
        s3 = "joy";
        soap = new Soap();
        toy = 4.3f;
    }

    //instanceinitialization
    {
        i = 35;
    }

    @Override
    public String toString() {
        if (s4 == null) {//delayed initialization
            s4 = "join";
        }
        return "s1=" + s1 + "\n" +
                "s2=" + s2 + "\n" +
                "s3=" + s3 + "\n" +
                "s4=" + s4 + "\n" +
                "i=" + i + "\n" +
                "toy=" + toy + "\n" +
                "soap=" + soap;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}
