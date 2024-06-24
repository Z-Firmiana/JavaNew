package com.javastudy.a08abstractdemo8;

public class Sheep extends Animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("山羊🐐在喝水💦");
    }

    @Override
    public void eat() {
        System.out.println("山羊🐐在吃草🌳");
    }
}
