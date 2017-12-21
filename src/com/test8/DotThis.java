package com.test8;

//Qualifying access to the outer-class object
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;// use ".this"
            //return new DotThis();
            //a plain "this" would be inner's "this"
        }
    }//inner-class

    public Inner inner() {
        return new Inner();
        //!return Inner.this;
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        DotThis.Inner dti = dotThis.inner();
        dti.outer().f();
        //test
        DotThis d = new DotThis();
        //must be use instance of outer class to create an instance of the inner class
        DotThis.Inner inner = d.new Inner();//use ".new "
    }
}
