package com.javastudy.test;

public class ApiTestMath {
    public static void main(String[] args) {
        //判断自幂数
        int count = 0;
        for (int i = 10000; i < 100000; i++) {
            double sum = 0;
            int temp = i;
            while (temp != 0) {
                int ge = temp % 10;
                sum += Math.pow(ge, 5);
                temp /= 10;
            }
            if (sum == i){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count);
    }
}
