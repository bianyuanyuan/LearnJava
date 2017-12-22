package com.test9;

//nested classes can access all members of all
class MNA {
    public void f() {
        System.out.println("f()");
    }

    class A {
        private void g() {
            System.out.println("g()");
        }

        public class B {
            void h() {
                System.out.println("h()");
                g();
                f();
            }
        }
    }
}

public class MulitNestingAccess {
    public static void main(String[] args) {
        MNA mna = new MNA();
        MNA.A mnaa = mna.new A();
        MNA.A.B mnaab = mnaa.new B();
        mnaab.h();
    }
}
