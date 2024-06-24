package com.javastudy.a09abstractdemo9;

public class BasketCoach extends Person implements Teach{

    @Override
    public void teach() {
        System.out.println("🏀教练在教运球");
    }

    public BasketCoach() {
    }

    public BasketCoach(String name, int age) {
        super(name, age);
    }
}
