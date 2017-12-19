package com.test6;

interface InstruMent {
    int value = 0;//static&final

    void play(int i);

    String what();

    void adjust();

    //int f();

}

class Wind1 implements InstruMent {

    @Override
    public void play(int i) {
        System.out.println(i);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() {
        System.out.println("Wind.adjust()");
    }
}

class Percussion1 implements InstruMent {

    @Override
    public void play(int i) {
        System.out.println(i);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Percussion.adjust()");
    }
}

class Stringed1 implements InstruMent {

    @Override
    public void play(int i) {
        System.out.println(i);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Stringed.adjust()");
    }
}

class Brass1 extends Wind1 {
    @Override
    public void play(int i) {
        super.play(i);
    }

    @Override
    public String what() {
        return "Brass";
    }
}

class WoodWind1 extends Wind1 {
    @Override
    public void play(int i) {
        super.play(i);
    }

    @Override
    public void adjust() {
        System.out.println("WAoodWind.adjust()");
    }
}

public class Music1 {

    public static void main(String[] args) {
        InstruMent[] instruMent = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new WoodWind1(),
        };
        //InstruMent instruMent1=new Instrument();
        for (InstruMent i :instruMent) {
            System.out.println(i.what());
        }
    }
}

abstract class TestAbstract {
    abstract void ff();
}