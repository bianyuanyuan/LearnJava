package com.test8;

//static method is not polymorphic
class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dybamicGet() {
        return "Base dynamicGet()";
    }
}

class SubStatic extends StaticSuper {
    public static String staticGet() {
        return "Detived staticGet()";
    }

    public String dybamicGet() {
        return "Detived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new SubStatic();//upcast
        System.out.println(sup.staticGet() + "," + sup.dybamicGet());
    }
}
