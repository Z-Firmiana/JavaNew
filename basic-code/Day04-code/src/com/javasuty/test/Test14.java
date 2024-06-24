package com.javasuty.test;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7) {
                continue;
            }
            System.out.println(i);
        }
    }
}
