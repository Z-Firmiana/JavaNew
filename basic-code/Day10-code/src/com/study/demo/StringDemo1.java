package com.study.demo;

public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        System.out.println(s1);

        String s2 = "";
        System.out.println("@" + s2 + "!");

        char[] chs = {'a', 'b', 'c'};
        String s4 = new String(chs);
        System.out.println(s4);
        chs[0] = 'Q';
        s4 = new String(chs);
        System.out.println(chs);

        byte[] btyes = {97, 98, 99, 100};
        String s5 = new String(btyes);
        System.out.println(s5);
    }
}
