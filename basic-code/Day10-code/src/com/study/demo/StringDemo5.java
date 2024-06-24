package com.study.demo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // 键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        int countA = 0;
        int counta = 0;
        int countint = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counta++;
            } else if (c >= 'A' && c <= 'Z') {
                countA++;
            } else if (c >= '0' && c <= '9') {
                countint++;
            }
        }
        System.out.printf("大写字母有%s个，小写字母有%s个，数字有%s个", countA, counta, countint);
    }
}
