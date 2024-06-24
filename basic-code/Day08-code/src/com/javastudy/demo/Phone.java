package com.javastudy.demo;


public class Phone {
    private double price;

    //set(赋值)
    public void setAge(double price) {
        if (price >= 0 && price < 9999) {
            this.price = price;
        } else {
            System.out.println("数据有误！");
        }
    }

    //get(获取)
    public double getAge() {
        return price;
    }
}
