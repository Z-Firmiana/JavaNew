package com.javastudy.a07extendsdemo7;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(String id, String name, String workCon) {
        super(id, name, workCon);
    }

    @Override
    public void work() {
        System.out.println("采购专员在工作");
    }
}
