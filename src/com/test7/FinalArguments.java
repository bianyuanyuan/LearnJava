package com.test7;

//use "final" with method arguments
class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(final Gizmo gizmo) {
        //!gizmo=new Gizmo();// gizmo is final
        System.out.println("with（）");
    }

    void without(Gizmo gizmo) {
        gizmo = new Gizmo();// gizmo is not a final
        gizmo.spin();
        System.out.println("without()");
    }

    void f(final int i) {
        // i++;//cannot do this,you can only read from a final arguments
    }

    int getI(final int i) {
        //return  i++;//cannot do this,you can only read from a final arguments
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments fn = new FinalArguments();
        fn.with(null);
        fn.without(null);
        System.out.println(fn.getI(62));
    }
}
