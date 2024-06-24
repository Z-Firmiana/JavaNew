package com.study.demo;

public class StringDemo2 {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = "Abc";
        System.out.println(s1 == s2); //比较的是地址值
        System.out.println(s1.equals(s2));//比较内容
        System.out.println(s1.equalsIgnoreCase(s2));//比较内容（不区分大小写【英文状态下】）
    }
}
