package com.oop;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("animal", "unknow", 4);
        animal.eat();

        Cat cat = new Cat("black", 4);
        cat.eat();

        Dog dog = new Dog("dog", "write", 4);
        dog.eat();
        dog.setKind("pet");

        Animal catNo = new Cat("dog", 4);
        catNo.eat();

        // Dog dog2=new Animal("dog","blue",4);
    }
}
