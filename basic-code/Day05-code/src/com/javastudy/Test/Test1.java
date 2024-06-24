package com.javastudy.Test;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = {33, 5, 22, 44, 55};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
