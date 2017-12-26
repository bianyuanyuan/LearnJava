package com.org;

class Automobile {
}

class But extends Automobile {
    void f(){
        System.out.println("what");
    }
}

class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    }

    Automobile get() {
        return a;
    }
}

//compare to Holder1
public class Holder2 {
    private Object a;

    public Holder2(Object a) {
        this.a = a;
    }

    public void set(Object a) {
        this.a = a;
    }

    public Object get() {
        return a;
    }

    public static void main(String[] args) {
        Holder2 holder = new Holder2(new Automobile());
        Automobile a = (Automobile) holder.get();//downcast
        holder.set("Not an Automobile");
        String s = (String) holder.get();
        holder.set(1);
        Integer x = (Integer) holder.get();

        //test
        Holder3<Automobile> h3 = new Holder3<Automobile>(new Automobile());
        Automobile a1 = h3.get();
        //! String s1=h3.get("Not an Automobile");
        Holder3<Integer> t3 = new Holder3<>(12);
        Holder3<Automobile> m=new Holder3<>(new But());
    }
}

//compare to Holder2
class Holder3<T> {
    private T a;

    public Holder3(T a) {
        this.a = a;
    }

    public T get() {
        return a;
    }

    public void set(T a) {
        this.a = a;
    }
}