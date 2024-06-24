package com.study.demo;

import java.util.Scanner;

public class StringDemo7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abc");
        sb.append("abc");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        String str = sb.toString();
        System.out.println(str.charAt(0));
    }

    public static String strReverse(String str) {
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
}
