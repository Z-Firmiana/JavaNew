package com.study.demo;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Student> list  = new ArrayList<>();
        Student stu1 = new Student("zxt", 19);
        Student stu2 = new Student("yfq", 20);
        Student stu3 = new Student("wt", 21);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        showElement(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName() + ", " + list.get(i).getAge());
        }
    }
    public static void showElement(ArrayList<Student> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i).getName());
            } else {
                System.out.print(list.get(i).getName() + ", ");
            }
        }
        System.out.println("]");
    }
}
