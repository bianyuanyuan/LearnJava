package com.org;

class Base {
    public Base() throws Exception, RuntimeException {
    }
}

class New extends Base {

    public New() throws Exception, RuntimeException {
        super();
        try {
            Base base = new Base();
        } catch (Exception e) {
            e.printStackTrace();
        }/*catch (RuntimeException e){
            e.printStackTrace();
        }*/
    }

}

public class ConstructionTest {
    public static void main(String[] args) {

    }
}
