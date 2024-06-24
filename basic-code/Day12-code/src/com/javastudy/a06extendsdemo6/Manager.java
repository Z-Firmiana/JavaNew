package com.javastudy.a06extendsdemo6;

public class Manager extends Person{
    private double bouns;

    public Manager() {

    }

    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("经理在管理其他人");
    }
}
