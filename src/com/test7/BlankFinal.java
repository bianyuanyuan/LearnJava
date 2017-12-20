package com.test7;

class Poppet {
    private int i;

    public Poppet(int i) {
        this.i = i;
    }
}

public class BlankFinal {
    private final int i = 0;
    private final int f;//Blank final
    private final Poppet poppet;//Blank final reference

    //blank finals must be initialize in the constructor
    public BlankFinal() {
        poppet = new Poppet(1);
        f = 11;//initialize f

    }

    //the second way to initialize blank finals
    public BlankFinal(int x) {
        f = x;
        poppet = new Poppet(x);
    }

    public static void main(String[] args) {
        BlankFinal blank1=new BlankFinal();
        new BlankFinal(12);
    }
}
