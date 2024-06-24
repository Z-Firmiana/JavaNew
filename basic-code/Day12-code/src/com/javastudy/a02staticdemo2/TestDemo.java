package com.javastudy.a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String s = ArrayUtil.printArr(arr);
        double avg = ArrayUtil.getAerage(arr);
        System.out.println(s);
        System.out.println(avg);
    }
}
