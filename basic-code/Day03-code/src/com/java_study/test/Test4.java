package com.java_study.test;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 老虎体重比较
/*      System.out.println("Enter the first tiger:");
        int weight1 = sc.nextInt();
        System.out.println("Enter the second tiger:");
        int weight2 = sc.nextInt();
        System.out.println(weight1 == weight2 ? "Same" : "Different");*/

        // 三个和尚比较身高
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;
        int h12 = height1 > height2 ? height1 : height2;
        int h_max = h12 > height3 ? h12 : height3;
        System.out.println("身高最高为：" + h_max);
    }
}
