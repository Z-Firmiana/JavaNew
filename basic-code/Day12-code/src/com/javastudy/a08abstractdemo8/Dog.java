package com.javastudy.a08abstractdemo8;

public class Dog extends Animal implements Swim{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void drink() {
        System.out.println("小狗🐶在喝水💦");
    }

    @Override
    public void eat() {
        System.out.println("小狗🐶在吃骨头🦴");
    }

    @Override
    public void swim() {
        System.out.println("小狗🐶在游泳🏊‍♂️");
    }
}
