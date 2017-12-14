package com.oop;

public class Animal {
    private String name;//what's the name
    private String color;//what's the color of the hair
    private int footNum;//how many foot

    public Animal(String name, String color,int footNum) {
        this.name = name;
        this.color = color;
        this.footNum=footNum;
    }

    public void eat() {
        System.out.println("EAT - Animal's food");
    }
}
