package com.javasuty.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //打印1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println("执行第" + i + "次断线重连的业务逻辑");
        }
        //打印5-1
        for (int n = 5; n >= 1; n--) {
            System.out.println(n);
        }
        //求和
        System.out.println("以下执行求和：");
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);

        //求偶数项的和
        System.out.println("求偶数项的和");
        int sum1 = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum1 += i;
            }
        }
        System.out.println("sum=" + sum1);
        //统计满足条件的数字
        System.out.println("统计满足既能被3也能被5整除的数字");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入最小值：");
        int min = sc.nextInt();
        System.out.println("输入最大值：");
        int max = sc.nextInt();

        int sum2 = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum2 += 1;
            }
        }
        System.out.println("既能被3也能被5整除的数字有" + sum2 + "个");
    }
}
