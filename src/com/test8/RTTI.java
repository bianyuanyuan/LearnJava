package com.test8;

//Downcasting & Runtime type information(RTTI)
class Useful {
    public void f() {
    }

    public void g() {
    }
}

class MoreUseful extends Useful {
    @Override
    public void f() {
    }

    @Override
    public void g() {
    }

    public void u() {
    }

    public void v() {
    }
}

public class RTTI {
    public static void main(String[] args) {
        Useful useful[] = {
                new Useful(),
                new MoreUseful(),
        };
        useful[0].f();
        useful[1].g();
        //!useful[1].u();//error
        ((MoreUseful)useful[1]).u();//downcast/RTTI
        //!((MoreUseful)useful[0]).v();//exception thrown  ClassCastException
    }
}
