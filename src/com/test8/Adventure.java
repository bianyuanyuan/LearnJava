package com.test8;

//Multiple interfaces
interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

class ActionCharacter {
    public void fight() {
        System.out.println("canfight");
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {

    @Override
    public void swim() {
        System.out.println("canswim");
    }

    @Override
    public void fly() {
        System.out.println("canfly");
    }

    @Override
    public void climb() {

    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);//Treat it as a CanFight
        u(hero);
        v(hero);
        w(hero);//Treat it as a ActionCharacter
    }
}

interface A {
    void f();
}

interface B extends A {
    void g();
}

interface C extends A {
    void u();
}

interface D extends B, C {

}