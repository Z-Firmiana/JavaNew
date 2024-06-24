package com.javastudy.a05extendsdemo5;

public class Test {
    public static void main(String[] args) {
        HaShiQi hsq = new HaShiQi();
        ShapiDog sp = new ShapiDog();
        ChineseDog cd = new ChineseDog();

        System.out.println("哈士奇行为");
        hsq.eat();
        hsq.drink();
        hsq.watchHome();
        hsq.breakHome();
        System.out.println();

        System.out.println("沙皮狗行为");
        sp.eat();
        sp.drink();
        sp.watchHome();
        System.out.println();

        System.out.println("中华田园犬行为");
        cd.eat();
        cd.drink();
        cd.watchHome();
        System.out.println();
    }
}
