package com.javastudy.a08abstractdemo8;

public class Frog extends Animal implements Swim{
    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("青蛙🐸在喝水💦");
    }

    @Override
    public void eat() {
        System.out.println("青蛙🐸在吃虫子🐛");
    }


    @Override
    public void swim() {
        System.out.println("青蛙🐸在游泳🏊‍♂️");
    }
}
