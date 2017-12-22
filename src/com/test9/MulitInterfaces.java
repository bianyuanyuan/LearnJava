package com.test9;

//two ways that a class can implments multiple interface
interface A {
}

interface B {
}

class X implements A, B {//the first way
}

class Y implements A {
    B makeB() {
        return new B() {//anoymous inner class
        };
    }
}

public class MulitInterfaces {
    public static void takeA(A a) {
    }

    public static void takeB(B b) {
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        takeA(x);
        takeB(x);
        takeA(y);
        takeB(y.makeB());
    }
}
