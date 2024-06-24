package com.javasuty.test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int number = sc.nextInt();
        boolean flag = true;
        if (number <= 0) {
            System.out.println("输入错误请重新输入！");
        } else {
            double sq_num = Math.sqrt(number);
            for (int i = 1; i <= sq_num; i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("该数是一个质数");
        } else {
            System.out.println("该数不是一个质数");
        }
    }
}
