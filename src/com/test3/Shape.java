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

    public static void doSomething(Shape shape) {//what to do
        shape.erase();
        shape.draw();
    }

    public static void main(String[] args) {
        Shape shape = new Circle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        //Line line=new Line();
        shape.draw();
        doSomething(circle);//doSomething() must be a static method
        doSomething(triangle);
        //Square square = (Square) shape;
        //square.getColor();
    }
}

class Circle extends Shape {//is-like-a

    public void filpVertical() {

    }
}

class Square extends Shape {//is-a

    @Override
    public void draw() {
        System.out.println("draw Square");
    }

}

class Triangle extends Shape {//is-a
}
