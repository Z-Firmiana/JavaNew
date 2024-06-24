package com.Javastudy.test;

public class Test3 {
    public static void main(String[] args) {
        double area1 = getArea(2.3, 1.2);
        double area2 = getArea(2.5, 1.1);
        String result = area1 > area2 ? "area1大" : "area2大";
        System.out.println(result);
    }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
