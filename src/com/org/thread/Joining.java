package com.org.thread;

class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int duration) {
        super(name);
        this.duration = duration;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);//sleep()
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted." + "isInterrupted():" + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}

class Joiner extends Thread {
    private Sleeper sleeper;

    public Joiner(String name, Sleeper sleeper) {
        super(name);
        this.sleeper = sleeper;
        start();
    }

    @Override
    public void run() {
        try {
            sleeper.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            return;
        }
        System.out.println(getName() + " join completed");
    }
}

public class Joining {
    public static void main(String[] args) {
        Sleeper
                sleeper = new Sleeper("Sleep", 1500),
                grumpy = new Sleeper("grumpy", 1500);
        Joiner
                dop = new Joiner("Dop", sleeper),
                doc = new Joiner("Doc", grumpy);
        grumpy.interrupt();
    }
}
