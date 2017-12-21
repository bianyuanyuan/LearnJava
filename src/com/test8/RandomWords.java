package com.test8;
//Implementing an interface to conform to a method

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {//readable
    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels = "aeiou".toCharArray();
    private int count;

    public RandomWords(int count) {
        this.count = count;
    }

    @Override
    public int read(@NotNull CharBuffer cb) {
        if (count-- == 0) {//indicate end of input
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;//number of  characters appended
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomWords(11));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        //test
        System.out.println("test2");
        RandomDoubles randomDoubles = new RandomDoubles();
        for (int i = 0; i < 7; i++) {
            System.out.println(randomDoubles.next());
        }

        //test
        System.out.println("test3");
        Scanner scan = new Scanner(new AdaptRandomDoubles(2));
        while (scan.hasNextDouble()) {
            System.out.println(scan.nextDouble());
        }
    }
}

class RandomDoubles {//random-double
    private static Random rand = new Random(47);

    public double next() {
        return rand.nextDouble();
    }
}

//create an adapter with inheritance
class AdaptRandomDoubles extends RandomDoubles implements Readable {
    private int count;

    public AdaptRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(@NotNull CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = Double.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
}