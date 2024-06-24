package com.study.demo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        String rightUserName = "Firmiana";
        String rightPassword = "zxt010526";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("请输入用户名：");
            String inputUserName = sc.next();
            System.out.println("请输入密码：");
            String inputPassword = sc.next();
            if (inputUserName.equals(rightUserName)) {
                if (inputPassword.equals(rightPassword)) {
                    System.out.println("登录成功！");
                    flag = false;
                } else {
                    count++;
                    if (count == 3) {
                        flag = false;
                        System.out.println("密码输入错误，你已经没有输入机会！");
                    } else {
                        System.out.println("密码输入错误，请重新输入！");
                    }

                }
            } else {
                count++;
                if (count == 3) {
                    flag = false;
                    System.out.println("用户名输入错误，你已经没有输入机会！");
                } else {
                    System.out.println("用户名输入错误，请重新输入！");
                }
            }
        }
    }
}
