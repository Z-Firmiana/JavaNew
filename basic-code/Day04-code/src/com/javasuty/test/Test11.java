package com.javasuty.test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = sc.nextInt();
        int oriNum = num;
        int fanNum = 0;
        int temp = 0;
        while (num != 0) {
            temp = num % 10;
            fanNum = fanNum * 10 + temp;
            num /= 10;
        }
        System.out.println("原始输入为：" + oriNum);
        System.out.println("反输入为：" + fanNum);
        if (fanNum == oriNum) {
            System.out.println("这是一个回文数");
        }else {
            System.out.println("这不是一个回文数");
        }
    }
}
