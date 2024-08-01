package com.javastudy.setdemo;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        /*
        需求：请自行选择比较器排序和自然排序两种方式：
        要求：存入四个字符串，"e"，"ab"，"df"，"qwer"
        按照长度排序，如果一样长则按照首字母排序

        采取第二种排序方式：比较器排序
         */

        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
        });

        String string1 = "e";
        String string2 = "ab";
        String string3 = "df";
        String string4 = "qwer";

        ts.add(string1);
        ts.add(string2);
        ts.add(string3);
        ts.add(string4);

        System.out.println(ts);
    }
}
