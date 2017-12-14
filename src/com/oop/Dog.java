package com.oop;

import java.net.SocketPermission;

public class Dog extends Animal {
    private String kind;//what's kind

    public Dog(String name, String color,int footNum) {
        super(name, color,footNum);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("EAT-dog‘s food");
    }

    public void setKind(String kind) {
        this.kind = kind;
        System.out.println(this.kind);
    }
}
