package com.org.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator, int id) {
        this.generator = generator;
        this.id = id;
    }

    public static void test(IntGenerator gp, int count) {
        System.out.println("Press Control-C to exit");
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i = 0; i < count; i++) {
            exe.execute(new EvenChecker(gp, i));
        }
        exe.shutdown();
    }

    public static void test(IntGenerator gp) {
        test(gp, 10);
    }

    @Override
    public void run() {
        while (!generator.isCanceled()) {
            int val = generator.next();
            if (val % 2 == 0) {
                System.out.println(val + " not even ");
                generator.cancel();//cancels all evencheckers
            }
        }
    }
}
