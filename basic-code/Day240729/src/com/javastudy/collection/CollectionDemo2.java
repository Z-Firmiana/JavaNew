package com.javastudy.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> coll = new ArrayList<>();

        Student s1 = new Student(24, "张三");
        Student s2 = new Student(21, "李四");
        Student s3 = new Student(22, "王五");

        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        Student s4 = new Student(21, "李四");

        System.out.println(coll.contains(s4));
    }
}
