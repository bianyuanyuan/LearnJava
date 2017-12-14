package com.test1;

public abstract class Employee {
    private String name;//what is his name
    private String address;//where is he
    private int number;//which is he

    public Employee(String name, String address, int number) {
        System.out.println("create an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        System.out.println("Inside Employee computePay");
        return 0.0;
    }

    @Override
    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adr) {
        address = adr;
    }


    public int getNumber() {
        return number;
    }

    public void mailCheck() {
        System.out.println("Mail-" + this.name + " " + this.address);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (o instanceof Employee) {
            Employee another = (Employee) o;
            return another.name.equals(this.name) && another.address.equals(this.address) && another.number == this.number;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
