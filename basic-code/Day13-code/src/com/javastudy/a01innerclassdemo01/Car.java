package com.javastudy.a01innerclassdemo01;

public class Car { // 外部类
    String carName;
    int carAge;
    String carColor;

    public void show() {
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    class Engine { // 内部类
        String engineName;
        int engineAge;

        public void show() {
            System.out.println(engineName);
            System.out.println(carName);
            System.out.println(carAge);
        }
    }

//    Engine e = new Engine();

}

