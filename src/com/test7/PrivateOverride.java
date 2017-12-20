package com.test7;

//try to override a private method
class Derived extends PrivateOverride {
    public void f() {
        System.out.println("Derived.f()");
    }
}

public class PrivateOverride {
    private void f() {
        System.out.println("PrivateOverride.f()");
    }

    public static void main(String[] args) {
        PrivateOverride p = new Derived();
        p.f();
    }
}
