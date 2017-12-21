package com.test8;

//Constructors and polymorphism cannot produce what you might expect
class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    public Glyph() {
        System.out.println("before draw()");
        draw();
        System.out.println("after draw()");
                }
                }

class RoundGlyph extends Glyph {
    private int radius = 1;

    void draw() {
        System.out.println("RoundGlyph.draw(),radius=" + radius);
    }

    public RoundGlyph(int r) {
        radius = r;
        System.out.println("RoundGlyph.draw(),radius=" + radius);
    }
}

class RectGlyph extends Glyph {
    private int radius = 1;

    void draw() {
        System.out.println("RectGlyph.draw(),radius=" + radius);
    }

    public RectGlyph(int r) {
        radius = r;
        System.out.println("RectGlyph.draw(),radius=" + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
        new RectGlyph(90);
    }
}
