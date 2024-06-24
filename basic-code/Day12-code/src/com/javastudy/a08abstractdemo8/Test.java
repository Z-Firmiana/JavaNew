package com.javastudy.a08abstractdemo8;

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog("小狗D", 2);
        Frog f = new Frog("青蛙f", 1);
        Sheep s = new Sheep("山羊s", 4);

        d.drink();
        d.eat();
        d.swim();
        System.out.println(d.getAge());
        System.out.println(d.getName());
        System.out.println();

        f.drink();
        f.eat();
        f.swim();
        System.out.println(f.getAge());
        System.out.println(f.getName());
        System.out.println();

        s.drink();
        s.eat();
        System.out.println(s.getAge());
        System.out.println(s.getName());
        System.out.println();
    }
}
