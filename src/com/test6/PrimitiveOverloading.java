package com.test6;

public class PrimitiveOverloading {
    public void f(char x) {
        System.out.println("char " + x);
    }

    public void f(byte x) {
        System.out.println("byte " + x);
    }

    public void f(short x) {
        System.out.println("short " + x);
    }

    public void f(int x) {
        System.out.println("int " + x);
    }

    public void f(long x) {
        System.out.println("long " + x);
    }

    public void f(float x) {
        System.out.println("float " + x);
    }

    public void f(double x) {
        System.out.println("double " + x);
    }

    public static void main(String[] args) {
        PrimitiveOverloading pr = new PrimitiveOverloading();
        pr.f(12);
        pr.f(12.2);
        pr.f(12.3f);
        pr.f((byte)12);
        pr.f((short)12);
        pr.f(127899787988788788L);
        pr.f('a');
    }
}
