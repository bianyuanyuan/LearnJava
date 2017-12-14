package com.test;

public class Pet {
    String name; //what's name the pet
    int age; //how old is the pet
    String kind; //what's kind the pet
    double price; //how much

    public Pet(String name) {
        this.name = name;
    }

    public void setAge(int iage) { //set age
        age = iage;
    }

    public void setKind(String skind) {
        kind = skind;
    }

    public void setPrice(double dprice) {
        price = dprice;
    }

    public void display() { //show the info of the pet
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("kind:" + kind);
        System.out.println("price:" + price);
    }
}
