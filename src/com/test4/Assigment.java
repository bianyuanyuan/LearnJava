package com.test4;

class Tank {
    int level;
}

public class Assigment {
    public static void main(String[] args) {
        Tank t1=new Tank();
        Tank t2=new Tank();
        t1.level=1;
        t2.level=10;
        System.out.println("1.t1.level:"+t1.level+",t2.level:"+t2.level);
        t2=t1;
        System.out.println("2.t1.level:"+t1.level+",t2.level:"+t2.level);
        t1.level=20;
        System.out.println("3.t1.level:"+t1.level+",t2.level:"+t2.level);
    }
}
