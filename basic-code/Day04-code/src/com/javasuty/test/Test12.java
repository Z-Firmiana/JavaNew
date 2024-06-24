package com.javasuty.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int bc_num = sc.nextInt();
        System.out.println("请输入除数");
        int c_num = sc.nextInt();
        int remain = 0;
        int count = 0;
        int temp = 0;
        if (bc_num > 0 && c_num > 0) {
            if (bc_num < c_num) {
                System.out.println("商为" + 0 + "余数为" + bc_num);
            } else {
                while (bc_num >= c_num) {
                    bc_num -= c_num;
                    count += 1;
                    remain = bc_num;
                }
                System.out.println("商为" + count + "余数为" + remain);
            }

        } else {
            System.out.println("输入错误！");
        }
    }
}
