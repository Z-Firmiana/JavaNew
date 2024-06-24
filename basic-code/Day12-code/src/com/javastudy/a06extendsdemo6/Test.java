package com.javastudy.a06extendsdemo6;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("001", "张三", 15000, 8000);
        System.out.println(m.getId() + "，" + m.getName() + "，" + m.getSalary() + "，" + m.getBouns());
        m.work();
        m.eat();

        Cook c = new Cook();
        c.setId("002");
        c.setName("厨师1");
        c.setSalary(15000);
        System.out.println(c.getId() + "，" + c.getName() + "，" + c.getSalary());
        c.work();
        c.eat();


    }
}
