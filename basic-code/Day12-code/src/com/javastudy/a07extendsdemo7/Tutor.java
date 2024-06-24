package com.javastudy.a07extendsdemo7;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name, String workCon) {
        super(id, name, workCon);
    }

    @Override
    public void work() {
        System.out.println("助教在工作");
    }
}
