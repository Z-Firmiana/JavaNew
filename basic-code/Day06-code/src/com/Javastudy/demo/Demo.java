package com.Javastudy.demo;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {2,588,888,1000,10000};
        int[] brr = new int[arr.length];
        int index = 0;
        while (index < arr.length) {
            int giftNum = r.nextInt(arr.length);
            if (method1(arr, brr, index, giftNum)) {
                System.out.println(arr[giftNum] + "元的奖金被抽出");
                index++;
            }
        }
    }

    public static boolean method1(int[] arr, int[] brr, int index, int giftNum) {
        if (numExistOrNot(brr, arr[giftNum])) {
            brr[index] = arr[giftNum];
            return true;
        }
        return false;
    }

    public static boolean numExistOrNot(int[] brr, int num) {
        for (int i = 0; i < brr.length; i++) {
            if (num == brr[i]) {
                return false;
            }
        }
        return true;
    }
}
