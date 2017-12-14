package com.oop;

public class Cat extends Animal {

    public Cat(String color,int footNum) {
        super("cat", color,footNum);
    }

    @Override
    public void eat() {
        System.out.println("EAT - cat's food");
    }
}
