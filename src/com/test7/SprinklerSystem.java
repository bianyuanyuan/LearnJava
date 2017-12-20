package com.test7;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String s1, s2, s3, s4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    @Override
    public String toString() {
        return "s1=" + s1 + " " +
                "s2=" + s2 + " " +
                "s3=" + s3 + " " +
                "s4=" + s4 + " " + "\n" +
                "i=" + i + " " +
                "f=" + f + " " +
                "source=" + source;
    }

    public static void main(String[] args) {
        SprinklerSystem sprinklerSystem=new SprinklerSystem();
        System.out.println(sprinklerSystem);
    }
}
