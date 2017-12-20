package com.test7;

//to see the order of running
class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        System.out.println("i=" + i + ",j=" + j);
        j = 34;
    }

    private static int x1 = printInit("static Beetle.x1 initialized");

    static int printInit(String s) {
        System.out.println(s);
        return 32;
    }
}

public class Beetle extends Insect {
    private int k = printInit("static Beetle.k initialized");

    public Beetle() {
        super();
        System.out.println("k=" + k + ",j=" + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        Beetle beetle = new Beetle();
    }
}
