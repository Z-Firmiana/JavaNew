package com.javastudy.a07extendsdemo7;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String id, String name, String workCon) {
        super(id, name, workCon);
    }

    @Override
    public void work() {
        System.out.println("教研部员工在工作");
    }
}
