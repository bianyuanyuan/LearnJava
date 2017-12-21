package com.test8;

import org.jetbrains.annotations.NotNull;

import javax.jws.Oneway;

//create a constructor for an anonymous inner class
abstract class Base {
    public Base(int i) {
        System.out.println("Base Constructor,i=" + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                System.out.println("Inside instance initi     ");
            }

            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base=getBase(34);
        base.f();

    }
}
