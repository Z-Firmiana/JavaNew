package com.javastudy.test;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerTest1 {
    public static void main(String[] args) {
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
         */

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("请输入一个整数：");
            String string_i = sc.nextLine();
            int i = Integer.parseInt(string_i);
            if (i < 1 || i > 100) {
                System.out.println("输入范围错误，重新输入");
                continue;
            }
            list.add(i);
            int sum = getSum(list);
            if (sum > 200) {
                System.out.println("数据和大于200");
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    private static int getSum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
