package com.test9;

//inheriting a inner class
class WihtInner {
    class Inner {
        public Inner() {
            System.out.println("Inner()");
        }
    }
}

public class InheritInner extends WihtInner.Inner {
    /* InheritInner() {//cannot compile
     }*/
    InheritInner(WihtInner w) {
        w.super();//enClosingClassReference.super();
    }

    public static void main(String[] args) {
        WihtInner wihtInner = new WihtInner();
        InheritInner h = new InheritInner(wihtInner);
    }
}
