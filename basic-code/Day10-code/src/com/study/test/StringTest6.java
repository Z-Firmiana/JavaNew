package com.study.test;

public class StringTest6 {
    public static void main(String[] args) {
        String arr = "abcde";
        String brr = "bcdae";
        if (checkEqu(arr, brr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static String rotateString(String str) {
        String str1 = str.substring(1);
        char c = str.charAt(0);
        String str2 = str1 + c;
        return str2;
    }

    public static boolean checkEqu(String arr, String brr) {
        String temp = arr;
        while (true) {
            arr = rotateString(arr);
            if (arr.equals(brr)) {
                return true;
            }
            if (arr.equals(temp)) {
                return false;
            }
        }
    }
}
