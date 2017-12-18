package com.test5;
//modifyed
import org.jetbrains.annotations.Contract;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AreaTest {
    public static float caculateArea(Point vertex[]) {// the method to caculate the area
        int i = 0;
        float temp = 0;
        for (; i < vertex.length - 1; i++) {
            temp += (vertex[i].x * vertex[i + 1].y - vertex[i].y * vertex[i + 1].x);//x1*y1-x2*y1+x2*y3-x3*y2+....
        }
        temp += (vertex[i].x * vertex[0].y - vertex[0].x * vertex[i].y);//xn*y1+x1*yn
        return fabs(temp / 2);
    }

    @Contract(pure = true)
    private static float fabs(float v) {//Caculate |v|
        if (v < 0)
            return -v;
        else
            return v;
    }

    public void SortPoint(Point vertex[]) {//
        Point point = vertex[0];//the first point
        float k[] = new float[vertex.length - 1];
        for (int i = 1; i < vertex.length; i++) {
            if (vertex[i].x == vertex[0].x) {
                //
            }
            k[i] = (vertex[i].y - vertex[0].y) / (vertex[i].x - vertex[0].x);//caculate
        }
        Arrays.sort(k);
    }

    //if a>b,return true,else return false
    @Contract(pure = true)
    public static boolean PointCmp(Point a, Point b, Point center) {
        if (a.x >= 0 && b.x < 0) {
            return true;
        }
        if (a.x == 0 && b.x == 0) {
            return a.y > b.y;
        }
        //OA X OB
        int flag = (a.x - center.x) * (b.y - center.y) - (b.x - center.x) * (b.y - center.y);
        if (flag < 0) {
            return true;
        }
        if (flag > 0) {
            return false;
        }
        //O、A、B in the same line
        //Math.pow(x,2);
        int d1 = (a.x - center.x) * (a.x - center.x) + (a.y - center.y) * (a.y - center.y);
        int d2 = (b.x - center.x) * (b.x - center.x) + (b.y - center.y) * (b.y - center.y);
        return d1 > d2;
    }

    public static void ClockwiseSortPoint(Point vertex[]) {//
        Point center = new Point();//the center of the points
        int x = 0, y = 0;
        for (int i = 0; i < vertex.length; i++) {
            x += vertex[i].x;
            y += vertex[i].y;
        }
        center.x = (int) x / vertex.length;
        center.y = (int) y / vertex.length;
        //sort
        for (int i = 0; i < vertex.length; i++) {
            for (int j = i; j < vertex.length - i - 1; j++) {
                if (PointCmp(vertex[j], vertex[j + 1], center)) {
                    Point temp = new Point(0, 0);
                    temp = vertex[j];
                    vertex[j] = vertex[j + 1];
                    vertex[j + 1] = temp;

                }
            }
        }

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int pointNum;
        Scanner in = new Scanner(System.in);
        System.out.println("input the num of the point,num<=100");
        pointNum = in.nextInt();//input the num of point from the keyboard
        if(pointNum<3||pointNum>100){
            return;
        }
        Random rand = new Random(47);
        Point[] vertex = new Point[pointNum];
        for (int i = 0; i < vertex.length; i++) {
            //vertex[i].x = rand.nextInt(100) ;// random -100~100
            //vertex[i].y = rand.nextInt(100) + (-100);// random -100~100
            vertex[i] = new Point(rand.nextInt(100)+(-100), rand.nextInt(100)+(-100));//init the array of point
        }

      /*  vertex[0] = new Point(2, 0);
        vertex[1] = new Point(4, 0);
        vertex[2] = new Point(5, 2);
        vertex[3] = new Point(3, 2);*/
        ClockwiseSortPoint(vertex);
        for (int i=0;i<vertex.length;i++) {
            System.out.print(vertex[i].x+" "+vertex[i].y+",");
        }
        System.out.println();
        System.out.println("the area of the Shape is " + caculateArea(vertex));


    }

}
