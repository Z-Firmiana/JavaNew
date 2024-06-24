package com.javastudy.test;

import java.util.Random;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = createNumber();
        System.out.println("中奖号码是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] brr = inputNumber();

        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
        System.out.println();
        int rednum = checkRed(arr, brr);
        int bluenum = checkBlue(arr, brr);
        System.out.println(rednum);
        System.out.println(bluenum);
    }

    public static int[] inputNumber() {
        //输入中奖号码
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            if (i <= 5) {
                System.out.println("输入第" + (i + 1) + "个红球号码：");
                int temp = sc.nextInt();
                if (temp >= 1 && temp <= 33 && contain(arr, temp)) {
                    arr[i] = temp;
                    i++;
                } else {
                    System.out.println("输入错误！");
                }
            } else {
                System.out.println("输入蓝球号码：");
                int temp = sc.nextInt();
                if (temp >= 1 && temp <= 16) {
                    arr[i] = temp;
                    i++;
                }

            }
        }
        return arr;
    }

    public static int[] createNumber() {
        //创建中奖号码
        int[] arr = new int[7];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            if (i <= 5) {
                int temp = r.nextInt(33) + 1;
                if (contain(arr, temp)) {
                    arr[i] = temp;
                    i++;
                }
            } else {
                int temp = r.nextInt(16) + 1;
                arr[i] = temp;
                i++;

            }
        }
        return arr;
    }

    public static boolean contain(int[] arr, int number) {
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                flag = false;
            }
        }
        return flag;
    }

    public static int checkRed(int[] arr, int[] brr) {
        int redcount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < brr.length - 1; j++) {
                if (arr[i] == brr[j]){
                    redcount++;
                    break;
                }
            }
        }
        return redcount;
    }
    public static int checkBlue(int[] arr, int[] brr){
        int bluecount = 0;
        if (arr[arr.length - 1] == brr[brr.length - 1]) {
            bluecount++;
        }
        return bluecount;
    }

}
