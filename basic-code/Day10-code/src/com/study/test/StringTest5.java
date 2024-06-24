package com.study.test;

import java.util.Scanner;

public class StringTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();
        boolean flag = ruleCheck(str);
        if (flag) {
            String newStr = toRoman(str);
            System.out.println(newStr);
        } else {
            System.out.println("输入错误，请重新输入！");
        }
    }

    public static boolean ruleCheck(String str) {
        if (str.length() <= 9) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static String toRoman(String str) {
        StringBuilder sb = new StringBuilder();
        String[] roman = { " ", "Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ" };
        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - 48;
            sb.append(roman[num]);
        }
        return sb.toString();
    }
}
