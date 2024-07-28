package com.javastudy.test;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        /*
        斐波那契数列：
        有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？
         */

        int MAX_SIZE = 12;
        int[] F = new int[MAX_SIZE];
        F[0] = 1;
        F[1] = 1;
        for (int i = 2; i < MAX_SIZE; i++) {
            F[i] = F[i-1] + F[i - 2];
        }

        System.out.println(Arrays.toString(F));




    }
}
