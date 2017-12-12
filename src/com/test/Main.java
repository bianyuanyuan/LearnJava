package com.test;

public class Main {
    public static void main(String[] args) {
       ListSize list=new ListSize();

       System.out.println("ldkjslgjldfihg");
       list.size=ListSize.Size.SMALL ;
       System.out.println(list.size + "!!!");
    }
}
class ListSize
{
    enum Size{SMALL,MEDIUM,LARGE};
    Size size;
}
