package com.test7;

//upcasting
class Instrumennt {
    public void play(Note i) {
        System.out.println("Instrument.play()" + i);
    }
}

class WindTest extends Instrumennt {
    public void play(Note i) {//redefine interface method
        System.out.println("WindTest.play()" + i);
    }
}

class Stringed extends Instrumennt {
    public void play(Note i) {//redefine interface method
        System.out.println("Stringed.play()" + i);
    }
}

class Brass extends Instrumennt {
    public void play(Note i) {//redefine interface method
        System.out.println("Brass.play()" + i);
    }
}

public class Music {
    public static void tune(Instrumennt t) {
        t.play(Note.MIDDLE_C);
    }

    public static void f(WindTest w) {
        w.play(Note.C_SHARP);
    }

    public static void f(Stringed s) {
        s.play(Note.B_FLAT);
    }

    public static void f(Brass b) {
        b.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        WindTest wd = new WindTest();
        tune(wd);//upcasting

        // not upcasting
        Stringed sr = new Stringed();
        Brass bs = new Brass();
        f(wd);
        f(sr);
        f(bs);
    }
}
