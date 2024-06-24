package com.javastudy.a09abstractdemo9;

public class PingpongPlayer extends Person implements Study,English{
    public PingpongPlayer() {
    }

    public PingpongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEn() {
        System.out.println("🏓运动员在展现英语水平");
    }

    @Override
    public void study() {
        System.out.println("🏓运动员在练习技术");
    }
}
