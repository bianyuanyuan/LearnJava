package com.org.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

//Build a complex model using generic containers
class Produce {//Produce class
    private final int id;
    private String description;
    private double price;

    private Produce(int id, String description, double price) {
        this.id = id;
        this.description = description;
        this.price = price;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return id + ":" + description + ".price:$" + price;
    }

    public void priceChange(double change) {
        price += change;
    }

    public static Generator<Produce> generator = new Generator<Produce>() {
        private Random random = new Random(47);

        @Override
        public Produce next() {
            return new Produce(random.nextInt(1000), "Test", Math.round(random.nextDouble() * 1000.0) + 0.99);//Math.round(double)
        }
    };
}

class Shelf extends ArrayList<Produce> {
    public Shelf(int nProduces) {
        Generators.fill(this, Produce.generator, nProduces);
    }
}

class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProduce) {
        for (int i = 0; i < nShelves; i++) {
            add(new Shelf(nProduce));
        }
    }
}

class CheckOutStand {
}

class Office {
}

public class Store extends ArrayList<Aisle> {
    private ArrayList<CheckOutStand> stands = new ArrayList<CheckOutStand>();
    private Office office = new Office();

    public Store(int nAisles, int nSelves, int nProduce) {
        for (int i = 0; i < nAisles; i++) {
            add(new Aisle(nSelves, nProduce));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Aisle a : this) {
            for (Shelf f : a) {
                for (Produce p : f) {
                    result.append(p);
                    result.append("\n");
                }

            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Store(8,5,2));
    }
}
