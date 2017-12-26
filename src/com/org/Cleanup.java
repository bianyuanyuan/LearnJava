package com.org;

//Guaranteeing proper cleaup of a resource
public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("/home/byy/IdeaProjects/WorkSpace/src/com/org/Cleanup.java");
            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null) ;
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile construction failed");
        }
    }
}
