package com.test9;

class D {
}

abstract class E {
}

class Z extends D {
    E makeE() {
        return new E() {
        };
    }
}

public class MultiImplementation {
    static void takeD(D d) {
        System.out.println("takeD(D)");
    }

    static void takeE(E e) {
        System.out.println("takeE(E)");
    }

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());

    }
}
