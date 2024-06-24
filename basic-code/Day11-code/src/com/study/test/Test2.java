package com.study.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone phone1 = new Phone("小米", 1000);
        Phone phone2 = new Phone("苹果", 8000);
        Phone phone3 = new Phone("锤子", 2999);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        getPhoneInfo(list);
        ArrayList<Phone> result = getPhoneInfo(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getBrand() + ", " + result.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list) {
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                resultlist.add(list.get(i));
            }
        }
        return resultlist;
    }
}
