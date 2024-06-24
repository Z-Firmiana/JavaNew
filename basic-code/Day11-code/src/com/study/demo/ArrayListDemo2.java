package com.study.demo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(56);
        list.add(66);
        list.add(76);
        list.add(86);
        showElement(list);
    }
    public static void showElement(ArrayList<Integer> list) {
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
