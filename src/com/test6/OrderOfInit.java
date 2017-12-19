package com.test6;

class Window {
    Window(int master) {
        System.out.println("Window(" + master + ")");
    }
}

class House {
    Window w1 = new Window(1);//the first to initial

    House() {
        System.out.println("House()");
        w3=new Window(33);
    }

    Window w2 = new Window(2);//second

    void f() {
        System.out.println("f()");
    }

    Window w3 = new Window(3);//third
    Window w4;
}

public class OrderOfInit {
    public static void main(String[] args) {
        //new House();
        new House().f();
    }
}
