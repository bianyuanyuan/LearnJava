package com.test7;

import java.lang.reflect.Method;

class Cleanser {
    private String s = "Cleanser";

    public void append(String s) {
        this.s += s;
    }

    public void dilute() {
        append("dilute()");
    }

    public void apply() {
        append("apply()");
    }

    public void scrub() {
        append("scrube()");
    }

    @Override
    public String toString() {
        return s;
    }

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.apply();
        cleanser.scrub();
        System.out.println(cleanser);
        //test the extends class
        //Detergent.main(args);//////////
    }

    public void main(int i) {
        System.out.println("void main()");
    }
}

public class Detergent extends Cleanser {
    //change a method
    @Override
    public void scrub() {
        append("Detergent.scrub()");
        super.scrub();//call base-class version
    }

    //add a new method
    public void foam() {
        append("foam()");
    }

    //test the new class
    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.apply();
        detergent.scrub();
        detergent.foam();
        System.out.println(detergent);
        //test base class
        System.out.println("Test base class");
        Cleanser.main(args);

        //test
        Class<?>classType =Cleanser.class;
        //Method[] methods=classType.getMethods();//use the getMethods
        Method[] methods=classType.getDeclaredMethods();//use the getMethods
        for(Method m:methods){
            System.out.println(m);
        }
    }
}
