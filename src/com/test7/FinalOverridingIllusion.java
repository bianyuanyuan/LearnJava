package com.test7;

class WithFinals {
    //identical to "private" alone
    private final void f() {
        System.out.println("Withfinals.f()");
    }

    //also automatically "final"
    private void g() {
        System.out.println("Withfinals.g()");
    }
}

class OverridingPrivate extends WithFinals {
    private final void f() {
        System.out.println("OverridingPrivate.f()");
    }

    private void g() {
        System.out.println("OverridingPrivate.g()");
    }
}

class OverridingPrivate2 extends OverridingPrivate {
    public final void f() {
        System.out.println("OverridingPrivate2.f()");
    }

    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}

public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        OverridingPrivate op = op2;
        //!op.f();//cannot call the method
        //!op.g();
        WithFinals wf=new WithFinals();
        //!wf.f();
        //!wf.g();
    }
}
