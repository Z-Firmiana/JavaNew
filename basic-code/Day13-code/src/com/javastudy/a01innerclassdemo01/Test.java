package com.javastudy.a01innerclassdemo01;

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.carAge = 4;
        c.carColor = "黑色";
        c.carName = "奔驰";

        c.show();
        System.out.println();

        Car.Engine e = new Car().new Engine();
        e.engineAge = 3;
        e.engineName = "不知道啊";
        e.show();
        System.out.println();
        c.show();
    }
}
