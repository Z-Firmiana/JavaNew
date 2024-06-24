package com.study.test;

import java.util.Scanner;

public class StringTest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        boolean result = reverseEqual(str);
        if (result) {
            System.out.println("是对称字符串。");
        } else {
            System.out.println("不是对称字符串。");
        }
    }

    // 对称字符串检测
    public static boolean reverseEqual(String str){
        StringBuilder sb = new StringBuilder(str);
        String reStr = sb.reverse().toString();
        if (str.equals(reStr)) {
            return true;
        } else {
            return false;
        }
    }
}
