package com.study.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class GovernSys {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        orMenu(list);

    }

    public static void orMenu(ArrayList<Student> list) {
        System.out.println("-------------欢迎来到黑马学生管理系统----------------");
        System.out.println("1：添加学生");
        System.out.println("2：删除学生");
        System.out.println("3：修改学生");
        System.out.println("4：查询学生");
        System.out.println("5：退出");
        System.out.println("请输入您的选择:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                addStu(list);
            }
            case 2 -> {
                deleteStu(list);
            }
            case 3 -> {
                modifyStu(list);
            }
            case 4 -> {
                showStu(list);
            }
            default -> {
                break;
            }
        }
    }

    public static void addStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("请输入该学生的id：");
        String id = sc.next();
        System.out.println("请输入该学生的姓名：");
        String name = sc.next();
        System.out.println("请输入该学生的年龄：");
        int age = sc.nextInt();
        System.out.println("请输入该学生的家庭住址：");
        String address = sc.next();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setAddress(address);
        if (checkRe(list, id)) {
            list.add(stu);
            System.out.println("添加成功！");
            orMenu(list);
        } else {
            System.out.println("学生id重复！");
            orMenu(list);
        }
    }

    public static void deleteStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生id");
        String id = sc.next();
        if (checkRe(list, id)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    list.remove(i);
                    System.out.println("删除成功！");
                    orMenu(list);
                } else {
                    System.out.println("id不存在！");
                    orMenu(list);
                }
            }
        }
    }

    public static void modifyStu(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        if (checkRe(list, id)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId().equals(id)) {
                    System.out.println("请输入修改该学生的姓名：");
                    String name = sc.next();
                    System.out.println("请输入修改该学生的年龄：");
                    int age = sc.nextInt();
                    System.out.println("请输入修改该学生的家庭住址：");
                    String address = sc.next();
                    list.get(i).setName(name);
                    list.get(i).setAge(age);
                    list.get(i).setAddress(address);
                    System.out.println("修改成功！");
                    orMenu(list);
                } else {
                    System.out.println("id不存在！");
                    orMenu(list);
                }
            }
        }
    }

    public static void showStu(ArrayList<Student> list) {
        if (list.size() > 0) {
            System.out.println("id\t姓名\t年龄\t家庭住址");
            for (int i = 0; i < list.size(); i++) {
                String id = list.get(i).getId();
                String name = list.get(i).getName();
                int age = list.get(i).getAge();
                String address = list.get(i).getAddress();
                System.out.println(id + "\t" + name + "\t" + age + "\t" + address);
            }
        } else {
            System.out.println("当前无学生信息，请添加后再查询");
            orMenu(list);
        }
    }

    public static boolean checkRe(ArrayList<Student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return false;
            }
        }
        return true;
    }
}
