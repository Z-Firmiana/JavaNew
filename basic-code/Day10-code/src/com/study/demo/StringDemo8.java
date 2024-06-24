package com.study.demo;

import java.util.StringJoiner;

public class StringDemo8 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("123").add("456").add("789");
        int len = sj.length();
        System.out.println(sj);
        System.out.println(len);
        String str = sj.toString();
        System.out.println(str.length());
    }
}
