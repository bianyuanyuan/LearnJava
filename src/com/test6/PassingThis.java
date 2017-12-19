package com.test6;

import org.jetbrains.annotations.Contract;

class Person {
    public void eat(Apple apple) {
        Apple appleed = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler {
    @Contract(pure = true)
    static Apple peel(Apple apple) {
        System.out.println("peel");
        return apple;
    }
}

class Apple {
    Apple getPeeled() {
        System.out.println("apple");
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
    new Person().eat(new Apple());
    }
}
