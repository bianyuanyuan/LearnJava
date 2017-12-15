package com.test4;

import static com.test4.Tank.fmethod;

class Tank {
    private static Tank tank;
    float level;

    Tank(float level) {
        this.level = level;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("final" + level);
    }

    /**
     * @param tank
     */
    protected static void fmethod(Tank tank) {
        Tank.tank = tank;
        tank.level = 12.3f;
    }
}

public class Assigment {
    public static void main(String[] args) {
        Tank t1 = new Tank(1.3f);
        Tank t2 = new Tank(2.4f);
        t1.level = 1.1f;
        t2.level = 10.2f;
        System.out.println("1.t1.level:" + t1.level + ",t2.level:" + t2.level);
        t2.level = t1.level;
        //t2=t1;
        System.out.println("2.t1.level:" + t1.level + ",t2.level:" + t2.level);
        t1.level = 20.3f;
        System.out.println("3.t1.level:" + t1.level + ",t2.level:" + t2.level);
        t2.level = 90.4f;
        System.out.println("4.t1.level:" + t1.level + ",t2.level:" + t2.level);

        fmethod(t1);//alt+enter
        t1.fmethod(t2);
        System.out.println("5.t1.level:" + t1.level + ",t2.level:" + t2.level);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.gc();
    }
}
