package com.test1;

import java.util.Scanner;
import java.util.Random;

class Point {
    public int x;// horizontal ordinate
    public int y;// vertical ordinate

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
}

public class AreaTest {
    public static float caculateArea(Point vertex[], int pointNum) {// the method to caculate the area
        int i = 0;
        float temp = 0;
        for (; i < pointNum - 1; i++) {
            temp += (vertex[i].x - vertex[i + 1].x) * (vertex[i].y + vertex[i + 1].y);
        }
        temp += (vertex[i].x - vertex[0].x) * (vertex[i].y + vertex[0].y);
        return temp / 2;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Point[] vertex = new Point[100];
        int pointNum ;
        Scanner in = new Scanner(System.in);
        /*for (int i = 0; i <pointNum; i++) {
            vertex[i] = new Point(0,0);
        }
        System.out.println("input the num of the point,num<=100");
        pointNum = in.nextInt();
        Random random = new Random(47);

        for (int i = 0; i < pointNum; i++) {
            vertex[i].x = random.nextInt(100) + 1;// random 1~100
            vertex[i].y = random.nextInt(100) + 1;// random 1~100
        }*/
        pointNum=4;
        vertex[0]=new Point(2,0);
        vertex[1]=new Point(4,0);
        vertex[2]=new Point(5,0);
        vertex[3]=new Point(3,2);
        System.out.println("the area of the Shape is " + caculateArea(vertex, pointNum));
    }

}
