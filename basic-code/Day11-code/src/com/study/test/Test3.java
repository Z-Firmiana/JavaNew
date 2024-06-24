package com.study.test;

import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Users> list = new ArrayList<>();
        Users user1 = new Users("001", "张三", "3000");
        Users user2 = new Users("002", "李四", "3500");
        Users user3 = new Users("003", "王五", "4000");
        Users user4 = new Users("004", "赵六", "4500");
        Users user5 = new Users("005", "田七", "5000");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + ", " + list.get(i).getPassword());
        }
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals("王五")) {
                list.get(i).setUsername("王小五");
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + ", " + list.get(i).getPassword());
        }
        System.out.println("--------------------------------------------------------------");



        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals("赵六")) {
                list.remove(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + ", " + list.get(i).getPassword());
        }
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUsername().equals("田七")) {
                list.get(i).setPassword(list.get(i).getPassword() + 500);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getUsername() + ", " + list.get(i).getPassword());
        }
        System.out.println("--------------------------------------------------------------");
    }
}
