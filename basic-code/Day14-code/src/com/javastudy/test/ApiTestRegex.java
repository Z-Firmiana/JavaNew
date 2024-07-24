package com.javastudy.test;

public class ApiTestRegex {
    public static void main(String[] args) {
        //大小写、字母、数字、下划线一共4-16位
        System.out.println("验证用户名");
        String regex1 = "\\w{4,16}";
        System.out.println("zhangsan".matches(regex1));
        System.out.println("$78822".matches(regex1));
        System.out.println("________________".matches(regex1));

        //身份证校验
        System.out.println("身份证校验");
        String regex2 = "[1-9]\\d{16}[\\dXx]";
        String regex3 = "[1-9]\\d{16}(\\d|x|X)";
        String id1 = "36012420010526001X";
        System.out.println(id1.matches(regex3));

        //忽略大小写：(?i)
        System.out.println("aBc".matches("a((?i)b)c"));

        /*
        身份证严格校验
        1.前六位：第一位不能为0，后面任意数字
        2.年的前半段：18，19，20
        3.年的后半段：任意数字出现两次
        4.月份：01~09，10，11，12
        5.日期：01~31
        6.后四位：任意数字3次，最后一位X或x
         */
        System.out.println("身份证严格校验");
        String regex4 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[1-2]\\d|30|31";

    }
}
