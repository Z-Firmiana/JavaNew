package com.javastudy.a05extendsdemo5;

public class ShapiDog extends Dog {
    @Override
    public void eat() {
        super.eat();
        System.out.println("吃骨头");
    }
}
