package com.org;

import com.test7.Bath;

import java.awt.*;

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException, RainedOut {
    }

    public abstract void atBat() throws Foul, Strike;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    //!void walk() throws PopFoul{}//Compile error,Interface cannot add exceptions to existing method from the base class
    @Override
    public void atBat() throws PopFoul {
        System.out.println("StormyInning atBat()");

    }

    @Override
    public void rainHard() throws RainedOut {

    }

    @Override
    public void event() throws RainedOut {
    }

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();

        } catch (PopFoul e) {
            System.out.println("Pop Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        try {
            Inning i = new StormyInning();
            i.atBat();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("General Baseball Exception");
        }
    }
}
