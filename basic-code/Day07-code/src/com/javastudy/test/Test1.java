package com.javastudy.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票价：");
        int price = sc.nextInt();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱位，0代表头等舱，1代表经济舱：");
        int type = sc.nextInt();

        if (month >= 5 && month <= 10) {
            price = getPrice(price, type, 0.9, 0.85);
            System.out.println("实际票价为：" + price);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            price = getPrice(price, type, 0.7, 0.65);
            System.out.println("实际票价为：" + price);
        }else {
            System.out.println("月份输入错误！");
        }
    }

    //计算价格可以抽取为方法
    public static int getPrice(int price, int type, double v0, double v1) {
        if (type == 0) {
            price = (int)(price*v0);
        } else if (type == 1) {
            price = (int)(price*v1);
        } else {
            System.out.println("输入舱位错误！");
        }
        return price;
    }
}
