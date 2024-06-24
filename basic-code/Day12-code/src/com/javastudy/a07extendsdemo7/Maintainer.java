package com.javastudy.a07extendsdemo7;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name, String workCon) {
        super(id, name, workCon);
    }

    @Override
    public void work() {
        System.out.println("维护专员在工作");
    }
}
