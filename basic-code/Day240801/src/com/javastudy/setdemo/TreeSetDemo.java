package com.javastudy.setdemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        /*
        需求：利用TreeSet存储整数并进行排序
         */

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(6);
        ts.add(8);
        ts.add(2);
        ts.add(0);
        ts.add(4);

        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            int i = it.next();
            System.out.println(i);
        }
        System.out.println("………………");
        for (Integer i : ts) {
            System.out.println(i);
        }

        System.out.println("………………");
        ts.forEach(integer -> System.out.println(integer));
    }
}
