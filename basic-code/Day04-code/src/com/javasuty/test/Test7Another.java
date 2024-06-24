package com.javasuty.test;

import java.util.Scanner;

public class Test7Another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入星期：");
        int week = sc.nextInt();

        switch (week) {
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            case 6, 7:
                System.out.println("休息日");
            default:
                System.out.println("输入错误");
                break;
        }

        System.out.println("请再一次输入星期：");
        int week1 = sc.nextInt();
        switch (week1){
            case 1, 2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入错误");
        }
    }
}
