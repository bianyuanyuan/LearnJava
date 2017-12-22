package com.test9;

import java.util.ArrayList;

//simple container example(produces compiler warnings)
class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {
}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //ArrayList apples = new ArrayList();
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }
        //Not prevented from adding an Orange to apples
        //!apples.add(new Orange());//compile-time error
        for (int i = 0; i < apples.size(); i++) {
            System.out.println((apples.get(i)).id());
            //Orange is detected only at run time
        }
        //using foreach
        for(Apple apple:apples){
            System.out.println(apple.id());
        }
    }
}
