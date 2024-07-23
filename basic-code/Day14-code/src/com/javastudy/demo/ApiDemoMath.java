package com.javastudy.demo;

public class ApiDemoMath {
    public static void main(String[] args) {
        int a = -10;
        System.out.println(Math.abs(a));
        double b = -10.542;
        System.out.println("向上取整：" + Math.ceil(b));
        System.out.println("向下取整：" + Math.floor(b));
        System.out.println("四舍五入：" + Math.round(b));
        double c1 = 10.8;
        double c2 = 10.11;
        System.out.println("c1和c2的最大值：" + Math.max(c1, c2));
        int d1 = 2;
        int d2 = 5;
        System.out.println(d1 + "的" + d2 + "次幂：" + Math.pow(d1, d2));


    }
}
