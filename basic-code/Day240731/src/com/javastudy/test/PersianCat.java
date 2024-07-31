package com.javastudy.test;

public class PersianCat extends Cat{

    @Override
    public void eat() {
        System.out.printf("一只叫做"+ getName() + "的，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
