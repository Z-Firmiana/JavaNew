package com.javasuty.test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入您的选择：");
        int task = sc.nextInt();

        switch (task) {
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("输入错误！");
        }

    }
}
