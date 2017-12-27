package com.org.test;

import org.jetbrains.annotations.Contract;
import sun.nio.cs.Surrogate;

import java.util.*;
import java.util.LinkedList;

class Customer {
    private static int counter = 1;
    private final int id = counter++;

    private Customer() {
    }

    @Override
    public String toString() {
        return "Custromer " + id;
    }

    //A method to produce Generator objects
    @Contract(value = " -> !null", pure = true)
    public static Generator<Customer> generator() {
        return new Generator<Customer>() {//inner class
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }
}

class Teller {
    private static int counter = 1;
    private final int id = counter++;

    private Teller() {
    }

    @Override
    public String toString() {
        return "Teller " + id;
    }

    //A single Generator object
    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}

public class BankTeller {
    public static void sever(Teller teller, Customer customer) {
        System.out.println(teller + " severs " + customer);
    }

    public static void main(String[] args) {
        //! sever(new Teller(),new Customer());//the constructor is private
        Random rand = new Random(47);
        Queue<Customer> customers = new LinkedList<Customer>();
        Generators.fill(customers, Customer.generator(), 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);
        for(Customer c:customers){
            sever(tellers.get(rand.nextInt(tellers.size())),c);
        }
    }
}
