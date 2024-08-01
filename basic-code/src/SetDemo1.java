package com.javastudy.setdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetDemo1 {
    public static void main(String[] args) {
        /*
         * 利用Set系列的集合，添加字符串，并使用多种方式遍历。
         * 迭代器
         * 增强for
         * Lambda表达式
         */

        // 1.创建Set集合对象
        Set<String> s = new HashSet<>();

        // 2.添加元素
        boolean r1 = s.add("Lisi");
        boolean r2 = s.add("Zhangsan");
        boolean r3 = s.add("Wangwu");

        // 3.无序打印
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s);

        // 4.遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            String string = it.next();
            System.out.println(string);
        }

        for (String s2 : s) {
            System.out.println(s2);
        }

        
        s.forEach(str -> System.out.println(str));

    }
}
