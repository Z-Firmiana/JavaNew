package com.javastudy.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        Random r = new Random();
        String code = "";
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else {
                chs[i] = (char) (65 + i -26);
            }
        }
//        for (int i = 0; i < chs.length; i++) {
//            System.out.print(chs[i]+ " ");
//        }
        for (int i = 0; i < 4; i++) {
            code = code + chs[r.nextInt(chs.length)];
        }
        code = code + r.nextInt(10);
        System.out.println();
        System.out.println(code);

    }

}
