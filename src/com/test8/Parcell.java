package com.test8;

//creating inner classes
public class Parcell {
    class Contents {
        private int i = 11;

        public int getValude() {
            return i;
        }
    }

    class Destibation {
        private String label;

        Destibation(String whereTo) {
            label = whereTo;
        }

        public String readLabel() {
            return label;
        }
    }

    //using the inner classes just like using other classes
    public void ship(String dest) {
        Contents c = new Contents();
        Destibation d = new Destibation(dest);
        System.out.println(d.readLabel());
    }

    public Destibation to(String dest) {
        return new Destibation(dest);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship2(String s) {
        Contents c = contents();
        Destibation d = to(s);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcell parcell = new Parcell();
        parcell.ship("Tasmania");

        //test
        Parcell p = new Parcell();
        //defining references to inner classes
        Parcell.Destibation destibation = p.to("Borneo");
        Parcell.Contents contents = p.contents();
    }
}
