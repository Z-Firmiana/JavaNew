package com.javastudy.a09abstractdemo9;

public class PingpongCoach extends Person implements Teach, English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEn() {
        System.out.println("🏓教练在展现英语技术");
    }

    @Override
    public void teach() {
        System.out.println("🏓教练在进行教学");
    }
}
