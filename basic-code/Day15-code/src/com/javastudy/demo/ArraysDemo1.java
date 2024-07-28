package com.javastudy.demo;

import java.util.Arrays;

public class ArraysDemo1 {
    public static void main(String[] args) {
        /*
        public static String toString(数组)                               把数组拼接成一个字符串
        public static int binarySearch（数组，查找的元素)                 二分查找法查找元素
        public static int[］copyof(原数组，新数组长度)                    拷贝数组
        public static int[］copyofRange(原数组，起始索引，结束索引)       拷贝数组 (指定范围)
        public static void fill(数组，元素)                               填充数组
        public static void sort(数组)                                     按照默认方式进行数组排序
        public static void sort(数组，排序规则)                           按照指定的规则排序
         */

        System.out.println("……………………toString……………………");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        System.out.println("……………………binarySearch……………………");
        // 元素必须有序
        System.out.println(Arrays.binarySearch(arr, 2)); // 1
        // 若元素不存在，返回(- 插入点 -1)；-1是为了防止插入点为0的情况
        System.out.println(Arrays.binarySearch(arr, 20)); // -11

        System.out.println("……………………copyof……………………");
        int[] newArr = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(newArr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // 新数组大于原数组，会补0
        int[] newArrMore = Arrays.copyOf(arr, 14);
        System.out.println(Arrays.toString(newArrMore)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0, 0]

        System.out.println("……………………copyofRange……………………");
        // 包头不包尾，包左不包右
        int[] newBrr = Arrays.copyOfRange(arr, 0, 9);
        System.out.println(Arrays.toString(newBrr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("……………………fill……………………");
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr)); // [100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        System.out.println("……………………sort……………………");
        // 默认进行升序排序，底层使用快速排序
        int[] arr2 = {10, 2, 3, 5, 8, 4, 1, 9 ,7, 6};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
