package com.javastudy.setdemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 23);
        Student student2 = new Student("李四", 24);
        Student student3 = new Student("王五", 25);
        Student student4 = new Student("666", 22);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();

        lhs.add(student4);
        lhs.add(student3);
        lhs.add(student2);
        lhs.add(student1);

        System.out.println(lhs);
    }
}
