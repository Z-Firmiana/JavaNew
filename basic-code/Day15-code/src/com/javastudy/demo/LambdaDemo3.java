package com.javastudy.demo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        /*
        定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
        要求：按照字符串的长度进行排序，短的在前面，长的在后面。（暂时不比较字符串里面的内容）
         */

        String[] arr = {"a", "aaaa", "aaa", "aa"};
        Arrays.sort(arr, (o1, o2) -> o2.length() - o1.length());

        System.out.println(Arrays.toString(arr));
    }
}
