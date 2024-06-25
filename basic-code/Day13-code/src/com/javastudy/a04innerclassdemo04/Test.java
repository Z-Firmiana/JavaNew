package com.javastudy.a04innerclassdemo04;

public class Test {
    public static void main(String[] args) {

        new Swim() {

            @Override
            public void swim() {
                System.out.println("在🏊‍♂️");
            }
        };

        
    }
}
