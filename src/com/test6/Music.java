package com.test6;

abstract class Instrument {
    private int i;

    public abstract void play(int note);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(int note) {
        System.out.println("wind.play()" + note);
    }

    @Override
    public String what() {
        return "wind";
    }

    @Override
    public void adjust() {

    }
}

class Percussion extends Instrument {

    @Override
    public void play(int note) {
        System.out.println("Percussion.play()" + note);
    }

    @Override
    public void adjust() {

    }

    @Override
    public String what() {
        return "Percussion";
    }

}

class Stringed extends Instrument {

    @Override
    public void play(int note) {
        System.out.println("Stringed.play()" + note);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {

    }
}

class WoodWind extends Wind {
    @Override
    public void play(int note) {
        System.out.println("WoodWind.play()" + note);
    }

    @Override
    public String what() {
        //return super.what();
        return "WoodWind";
    }
}

class Brass extends Wind {
    private int size;

    @Override
    public void adjust() {
        System.out.println("Brass.adjust()");
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

public class Music {
    public static void main(String[] args) {
        Instrument[] ins = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind(),
                /*new Instrument() {
                    @Override
                    public void play(int note) {

                    }

                    @Override
                    public void adjust() {

                    }
                }*/
        };
        for (Instrument i:ins) {
            System.out.println(i.what());
        }
        NoneMethod st = new testNm();
        st.f1();
    }
}

abstract class NoneMethod {
    private int x;

    public void f1() {
        System.out.println("NoneMethod.f()");
    }
}


class testNm extends NoneMethod {
    public void f1() {
        System.out.println("testNm.f()");
    }
}