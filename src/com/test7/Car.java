package com.test7;

//Composition with public objects
class Engine {
    private void start() {
    }

    public void rev() {
    }

    public void stop() {
    }

    public void service() {
    }
}


class Weel {
    public void inflate(int psi) {
    }
}

class Window {
    public void pullUp() {
    }

    public void pillDown() {
    }
}

class Door {
    public Window window = new Window();

    public void open() {
    }

    public void close() {
    }
}

public class Car {
    public Engine engine = new Engine();
    public Weel[] weels = new Weel[4];
    public Door left = new Door(), right = new Door();//two-door

    public Car() {
        /*for (Weel w : weels) {
            w = new Weel();//In this way to initialize will throw  NullPointerException
        }*/
        for (int i = 0; i < weels.length; i++) {
            weels[i] = new Weel();//initialized the weels
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.pullUp();//pullup the window int the left of the door
        car.weels[0].inflate(45);
        car.engine.service();
    }
}
