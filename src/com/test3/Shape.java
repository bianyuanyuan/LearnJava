package com.test3;

public class Shape {
    private int size;
    private String color;
    private String position;

    public void draw() {
        System.out.println("draw shape");
    }

    public void erase() {

    }

    public void move() {

    }

    public String getColor() {
        return "unknown";
    }

    public void setColor() {

    }

    public static void main(String[] args) {
        Shape shape=new Circle();
        shape.draw();
    }
}

class Circle extends Shape {
    public void FilpVertical() {

    }
}

class Square extends Shape {
    @Override
    public void draw() {

    }

}

class Triangle extends Shape {

}