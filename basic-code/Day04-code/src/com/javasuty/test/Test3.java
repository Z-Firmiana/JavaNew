package com.javasuty.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("身上多少钱：");
        int money = sc.nextInt();

        if (money >= 100) {
            System.out.println("吃网红餐厅");
        } else {
            System.out.println("吃沙县小吃");
        }
    }
}
