package com.test3;

public class ObjectInstance {
    private int num;
    private String name;

    @Override
    public String toString() {
        return "Override the method of toString() in " + getClass().getName() + " class";
    }

    public static void main(String[] args) {
        System.out.println(new ObjectInstance());
    }
}
