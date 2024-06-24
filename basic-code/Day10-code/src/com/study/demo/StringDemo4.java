package com.study.demo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        int length = str.length();
        char a = str.charAt(2);
        System.out.println("数组长度为：" + length + "，第三个位置为：" + a);
        //依次表示字符串的每个索引（遍历字符串）
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
