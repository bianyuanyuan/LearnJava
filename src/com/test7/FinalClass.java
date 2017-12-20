package com.test7;

//make an entire class final
class Small {
}

final class FinalTest {
    int i = 9;
    float j = 12.4f;
    Small small = new Small();

    final void f() {
        System.out.println("i=" + i + ",j=" + j);
    }
}

/*!cannot inherit from FinalTest,because it is a final class
class Test extends FinalTest{
}
*/
public class FinalClass {
    public static void main(String[] args) {
        FinalTest ft = new FinalTest();
        ft.f();
        ft.i = 44;
        ft.j = 12.3f;
        ft.f();
    }
}

class Person {
    final void f(int i) {
        System.out.println(i);
    }
}

class Student extends Person {
    //@Override   the final method cannot override
   /* final void f(int i) {
    }*/
}