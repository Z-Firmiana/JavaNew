package com.javastudy.a01staticdemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student.teacherName = "Firmiana";
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(23);
        s1.setGender("男");
        s1.study();
        s1.show();

        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(21);
        s2.setGender("女");
        s2.study();
        s2.show();
    }
}
