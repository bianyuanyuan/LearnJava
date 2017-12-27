package com.org.test;

public class GenericMethods {
    public <T> void g() {
    }

    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.f("hi");
        genericMethods.f(90);
        genericMethods.f(12.5);
        genericMethods.f(123.4f);
        genericMethods.f('s');
        genericMethods.f(false);
    }
}
