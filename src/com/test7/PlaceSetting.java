package com.test7;

class Plate {
    public Plate(int i) {
        System.out.println("Plate Constructor");
    }
}

class DinnerPlate extends Plate {

    public DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate Constructor");
    }
}

class Utensil {
    public Utensil(int i) {
        System.out.println("Utensil Constructor");
    }
}

class Spoon extends Utensil {

    public Spoon(int i) {
        super(i);
        System.out.println("Spoon Constructor");
    }
}

class Fork extends Utensil {

    public Fork(int i) {
        super(i);
        System.out.println("Fork Constructor");
    }
}

class Knife extends Utensil {

    public Knife(int i) {
        super(i);
        System.out.println("Knife Constructor");
    }
}

//a cultural way of do something
class Custom {
    Custom(int i) {
        System.out.println("Custom Constructor");
    }
}

public class PlaceSetting extends Custom {
    private Spoon spoon;
    private DinnerPlate dinnerPlate;
    private Fork fork;
    private Knife knife;

    PlaceSetting(int i) {
        super(i + 1);
        spoon = new Spoon(2);
        fork = new Fork(3);
        knife = new Knife(4);
        dinnerPlate = new DinnerPlate(5);
        System.out.println("PlaceSetting Constructor");
    }

    public static void main(String[] args) {
        PlaceSetting placeSetting = new PlaceSetting(9);
    }
}
