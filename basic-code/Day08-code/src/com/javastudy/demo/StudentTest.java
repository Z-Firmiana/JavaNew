package com.javastudy.demo;

public class StudentTest {
    public static void main(String[] args) {
//        Student s = new Student("周", 23);
        Student s = new Student();
        String name = s.getName();
        int age = s.getAge();
        System.out.println(name + age);
    }
}
