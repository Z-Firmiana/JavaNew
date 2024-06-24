package com.java_study.test;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入自己衣服的时髦度：");
        int myFashion = sc.nextInt();

        System.out.println("请输入对象衣服的时髦度：");
        int objectFashion = sc.nextInt();

        boolean result = myFashion > objectFashion;
        System.out.println(result);
    }
}
