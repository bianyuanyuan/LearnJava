package com.test8;

//Direct field access is determined at compile time
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getFieldSuper() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sub = new Sub();//upcast
        System.out.println("sub.field=" + sub.field + ",sub.getField=" + sub.getField());
        Sub s = new Sub();
        System.out.println("s.field=" + s.field + ",s.getField=" + s.getField() + "，s.getFieldSuper=" + s.getFieldSuper());
    }
}
