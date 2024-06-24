package com.javasuty.test;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (num < 2) {
            System.out.println("the number is wrong!");
        } else {
            int i = 1;
            while (i * i <= num) {
                i++;
                if (i * i > num) {
                    System.out.println("x的平方根为：" + (i - 1));
                }
            }
        }
    }
}
