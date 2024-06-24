package com.java_study.test;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();

        boolean result = a == 6 || b == 6 || (a + b) % 6 == 0;
        System.out.println(result);
        
    }
}
