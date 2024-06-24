package com.javastudy.test;

public class Test7 {
    public static void main(String[] args) {
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int sum = 0;
        int[] yearSum = new int[4];
        for (int i = 0; i < arr.length; i++) {
            int sum1 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum1 = sum1 + arr[i][j];
            }
            yearSum[i] = sum1;
            System.out.println("第" + (i+1) + "个季度的总营业额为：" + sum1);
        }
        for (int i = 0; i < yearSum.length; i++) {
            sum += yearSum[i];
        }
        System.out.println("年度营业额为：" + sum);
    }
}
