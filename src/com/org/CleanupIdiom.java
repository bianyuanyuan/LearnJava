package com.org;

//Each disposable object must be followed by a try-finally
class NeedsCleanup {//Construction can't fail
    private static long counter = 1;
    private final long id = counter++;

    public void dispose() {
        System.out.println("NeedsCleanip " + id + " disposed");
    }
}

class ConstructionException extends Exception {
}

class NeedsCleanup2 extends NeedsCleanup {
    //Construction can fail

    public NeedsCleanup2() throws ConstructionException {
    }
}

public class CleanupIdiom {
    public static void main(String[] args) {
//section 1
        NeedsCleanup n1 = new NeedsCleanup();
        try {
            //
        } finally {
            n1.dispose();
        }
        //section 2
        //if construction cannot fail you can group objects:
        NeedsCleanup n2 = new NeedsCleanup();
        NeedsCleanup n3 = new NeedsCleanup();
        try {
            //
        } finally {
            n3.dispose();//Reverse order of construction
            n2.dispose();
        }

        //section 3
        try {
            NeedsCleanup2 n4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 n5 = new NeedsCleanup2();
                try {
                    //
                } finally {
                    n5.dispose();
                }
            } catch (ConstructionException e) {//n5 constructor
                System.out.println(e);
            } finally {
                n4.dispose();
            }
        } catch (ConstructionException e) {//n4 constructor
            System.out.println(e);
        }
    }
}
