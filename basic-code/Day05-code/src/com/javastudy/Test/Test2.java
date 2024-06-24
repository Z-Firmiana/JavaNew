package com.javastudy.Test;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;
        int count = 0;
        double avg = 0.0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / (double) (arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("该数据的和为" + sum + "。平均值为：" + avg + "。有" + count + "个数据比平均值小。");
    }
}
