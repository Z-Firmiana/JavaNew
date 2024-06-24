package com.javasuty.test;


import java.util.Random;
import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100) + 1; //1~100
//        boolean flag = false;
        System.out.println("number = " + number);
        while (true) {
            System.out.println("请输入你猜的数字：");
            int i = sc.nextInt();
            if (i == number) {
                System.out.println("你猜对了！");
                break;
            } else if (i < number) {
                System.out.println("你猜小了");
            } else {
                System.out.println("你猜大了");
            }
        }
    }
}
