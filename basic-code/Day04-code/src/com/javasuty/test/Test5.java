package com.javasuty.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("小明的成绩是：");
        int score = sc.nextInt();

        if (score <= 100 && score >= 95) {
            System.out.println("送自行车一辆");
        } else if (score < 95 && score >= 90) {
            System.out.println("游乐场游玩一天");
        } else if (score < 90 && score >= 80) {
            System.out.println("送变形金刚一个");
        } else if (score < 80) {
            System.out.println("揍一顿！");
        } else {
            System.out.println("成绩录入错误！");
        }
    }
}
