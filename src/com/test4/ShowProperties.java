package com.test4;
//:object/ShowProperties

/**
 * The first thingking in java example program.
 * Displays a string and today's date.
 *
 * @author bianyy1211
 * @author www.MindView.net
 * @version 8.0
 */
public class ShowProperties {
    /*@parm
     *@thorws
     */
    public static void main(String[] args) {
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user name"));
        System.out.println(System.getProperty("java.library.path"));
    }
///:~
}/*Output
 */
