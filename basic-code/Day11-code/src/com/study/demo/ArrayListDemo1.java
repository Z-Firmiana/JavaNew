package com.study.demo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("第一个字符");
        list.add("第二个字符");
        list.add("第三个字符");
        showElement(list);
    }

    public static void showElement(ArrayList<String> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
