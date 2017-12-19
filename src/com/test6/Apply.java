package com.test6;

import java.util.Arrays;

interface Processor {
    public String name();

    Object process(Object input);
}

class UpCase implements Processor {
    @Override
    public String name() {
        return "UpCase";
    }
    @Override
    public String process(Object input) {//Coveriant return
        return ((String) input).toUpperCase();
    }
}

class DownCase implements Processor {
    @Override
    public String name() {
        return "DownCase";
    }
    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter implements Processor {
    String procerss(Object input) {
        return Arrays.toString(((String) input).split(" "));//split the string by the " "
    }

    @Override
    public String name() {
        return "Splitter";
    }

    @Override
    public Object process(Object input) {
        return input;
    }
}

public class Apply {
    public static void process(Processor p, Object o) {
        System.out.println(p.name());
        System.out.println(p.process(o));
    }

    public static String str = "I am a student ,and I am leraning java.";

    public static void main(String[] args) {
        process(new UpCase(), str);
        process(new DownCase(), str);
        process(new Splitter(), str);//
    }
}
