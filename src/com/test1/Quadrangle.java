package com.test1;

public class Quadrangle {//class Quadrangle
    private Quadrangle[] qtest = new Quadrangle[6];//a array to save quadrangle
    private int nextIndex = 0;//create index

    public void draw(Quadrangle quadrangle) {//method
        if (nextIndex < qtest.length) {
            qtest[nextIndex] = quadrangle;
            System.out.println(nextIndex);
            nextIndex++;
        }
    }

    public static void main(String[] args) {//main method
        Quadrangle quadrangle = new Quadrangle();
        quadrangle.draw(new Square());
        quadrangle.draw(new Parallelogramgle());
    }

}

class Square extends Quadrangle {//class Square

    public Square() {
        System.out.println("this is a square");
    }
}

class Parallelogramgle extends Quadrangle {//class Parallelogramgle

    public Parallelogramgle() {
        System.out.println("this is a parallelogramgle");
    }

}