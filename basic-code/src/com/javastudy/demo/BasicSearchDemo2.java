package com.javastudy.demo;

import java.util.ArrayList;

public class BasicSearchDemo2 {
    public static void main(String[] args) {
        /*
        课堂练习1：
        需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        要求：不需要考虑数组中元素是否重复
        */

        /*
        课堂练习2：
        需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        要求：需要考虑数组中元素有重复的可能性
        {131, 127, 147, 81, 103, 23, 7, 79, 81}
        我要查找81，想要返回的是所有索引 3 8
         */
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        int number = 81;
        ArrayList<Integer> list = basicSearch(arr, number);
        System.out.println(list);

    }

    private static ArrayList<Integer> basicSearch(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                list.add(i);
            }
        }
        return list;
    }
}
