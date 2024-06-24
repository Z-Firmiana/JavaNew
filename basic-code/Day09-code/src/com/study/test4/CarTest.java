package com.study.test4;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car[] arr = new Car[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();

            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            c.setBrand(brand);

            System.out.println("请输入汽车价格：");
            int price = sc.nextInt();
            c.setPrice(price);

            System.out.println("请输入汽车颜色：");
            String color = sc.next();
            c.setColor(color);

            arr[i] = c;
        }

        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println(c.getBrand() + "，" + c.getPrice() + "，" + c.getColor());
        }

        double avg = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            sum += c.getPrice();
        }
        avg = sum / arr.length;
        System.out.println(avg);
    }
}
