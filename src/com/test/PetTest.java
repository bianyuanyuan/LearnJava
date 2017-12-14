package com.test;

public class PetTest {
    public static void main(String[] ages) {
        Pet dog = new Pet("wangwang");//create a pet
        //init
        dog.setAge(2);
        dog.setKind("dog");
        dog.setPrice(1200);
        dog.display();

        Pet cat = new Pet("miaomiao");
        cat.setAge(3);
        cat.setKind("cat");
        cat.setPrice(2000);
        cat.display();
    }
}
