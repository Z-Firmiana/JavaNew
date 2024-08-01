package com.javastudy.setdemo;

import java.util.TreeSet;

public class TreeSetDemo2 {
    public static void main(String[] args) {
        /*
        需求：创建TreeSet集合，并添加3个学生对象
            学生对象属性：
                姓名，年龄

        要求：
            按照学生的年龄进行排序
            同年龄按照姓名字母排列（暂不考虑中文）
            同姓名，同年龄认为是同一个人

        方式一：
            默认的排序规则/自然排序
            Student实现Comparable接口，重写里面的抽象方法，再指定比较规则
         */

        Student student1 = new Student("zhangsan", 23);
        Student student2 = new Student("zhbsi", 23);
        Student student3 = new Student("wangwu", 23);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(student1);
        ts.add(student3);
        ts.add(student2);

        System.out.println(ts);
    }
}
