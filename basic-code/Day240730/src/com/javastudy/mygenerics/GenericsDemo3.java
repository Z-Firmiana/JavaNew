package com.javastudy.mygenerics;

import java.util.ArrayList;

public class GenericsDemo3 {
    public static void main(String[] args) {
        /*
        定义一个工具类：ListUtil
        类中定义一个静态方法addAll，用来添加多个集合的元素。
         */

        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list, "321313", "ahwjjkw", "吉安卡罗文件", "就爱看来得及");
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ListUtil.addAll(list1, 1, 2, 3, 4);
        System.out.println(list1);

        ListUtil.addAll2(list1, 5, 6, 7, 8, 9, 0);
        System.out.println(list1    );
    }
}
