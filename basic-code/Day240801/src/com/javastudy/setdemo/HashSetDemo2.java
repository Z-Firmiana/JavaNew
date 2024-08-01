package com.javastudy.setdemo;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现在控制台遍历该集合。
        要求：学生对象的成员变量值相同，我们就认为是同一个对象
         */

        Student student1 = new Student("张三", 23);
        Student student2 = new Student("李四", 24);
        Student student3 = new Student("王五", 25);
        Student student4 = new Student("张三", 23);

        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);

        System.out.println(hashSet);
    }
}
