package com.javastudy.test;

public class LiHuaCat extends Cat{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getName() + "岁的狸花猫，正在吃鱼");
    }
}
