package com.test7;

class Art {//base class

    Art() {
        System.out.println("Art constructor");
    }

    Art(int i) {
        System.out.println("Art constructor" + i);
    }
}

class Drawing extends Art {
    /*Drawing() {
        System.out.println("Drawing constructor");
    }*/
    Drawing(int i) {
        super(i);
        System.out.println("Drawing constructor"+i);
    }
}

public class Cartoon extends Drawing {
    Cartoon() {
        super(11);
        System.out.println("Cartoon constructor");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}
