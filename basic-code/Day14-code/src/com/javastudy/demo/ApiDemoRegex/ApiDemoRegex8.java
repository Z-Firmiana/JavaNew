package com.javastudy.demo.ApiDemoRegex;

public class ApiDemoRegex8 {
    public static void main(String[] args) {
        /*
        每组都有组号，也就是序号
        规则1：从1开始，连续不断
        规则2：以左括号为基准，最左边的是第一组，其次为第二组，以此类推
        例：(\\d+(\\d+))，整体为第一组，里面的()为第二组

        捕获分组：就是把这一组的数据捕获出来，再用一次
         */

        /*
        需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        举例: a123a b456b 17891 &abc& a123b(false)
        组号：表示把第X组的内容再出来用一次
         */
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));
        System.out.println("--------------------------");


        /*
        需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
         */
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("---------------------");

        /*
        需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        (.):把首字母看做一组
        \\2:把首字母拿出来再次使用
        *:作用于\\2,表示后面重复的内容出现0次或多次
         */
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));
        System.out.println("aaa123aab".matches(regex3));

        /*
        需求:
        将字符串:我要学学编编编编程程程程程程替换为:我要学编程
         */
        String str = "我要学学编编编编程程程程程程";
        /*
        需求:把重复的内容 替换为 单个的
        学学                学
        编编编编            编
        程程程程程程        程
        (.)表示把重复内容的第一个字符看做一组
        \\1表示第一字符再次出现
        + 至少一次
        $1 表示把正则表达式中第一组的内容，再拿出来用
         */

        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
