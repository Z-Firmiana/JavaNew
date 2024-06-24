package com.javastudy.a09abstractdemo9;

public class Test {
    public static void main(String[] args) {
        BasketCoach bc = new BasketCoach("篮球教练", 40);
        BasketPlayer bp = new BasketPlayer("库里", 30);
        PingpongCoach pc = new PingpongCoach("刘国梁", 50);
        PingpongPlayer pp = new PingpongPlayer("马龙", 30);

        System.out.println(bc.getName() + "，" + bc.getAge());
        bc.teach();
        System.out.println();

        System.out.println(bp.getName() + "，" + bp.getAge());
        bp.study();
        System.out.println();

        System.out.println(pc.getName() + "，" + pc.getAge());
        pc.teach();
        pc.speakEn();
        System.out.println();

        System.out.println(pp.getName() + "，" + pp.getAge());
        pp.study();
        pp.speakEn();
    }
}
