package com.javastudy.a07extendsdemo7;

public class AdminStaff extends Employee{
    public AdminStaff() {
    }

    public AdminStaff(String id, String name, String workCon) {
        super(id, name, workCon);
    }

    @Override
    public void work() {
        System.out.println("行政部员工在工作");
    }
}
