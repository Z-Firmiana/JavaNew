package com.javasuty.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你的电影票号是：");
        int movieNum = sc.nextInt();
        if (movieNum >= 1 && movieNum <= 100) {
            if (movieNum % 2 == 0) {
                System.out.println("坐右边");
            } else {
                System.out.println("坐左边");
            }
        } else {
            System.out.println("你的票号错误！");
        }
    }
}
