package com.javastudy.a09abstractdemo9;

public class BasketPlayer extends Person implements Study{
    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("🏀队员在练习三分");
    }
}
