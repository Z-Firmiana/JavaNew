package com.javastudy.setdemo;

import java.util.TreeSet;

public class TreeSetDemo4 {
    public static void main(String[] args) {
        /*
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学一样，按照英语成绩排
        如果英文一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存
         */

        Student2 s1 = new Student2("zhangsan", 23, 90, 99, 60);//249
        Student2 s2 = new Student2("lisi", 23, 90, 99, 60);//249
        Student2 s3 = new Student2("wangwu", 25, 95, 100, 50.5);//245.5
        Student2 s4 = new Student2("zhaoliu", 26, 60, 99, 89.5);//248.5
        Student2 s5 = new Student2("qianqi", 26, 70, 80, 89.5);//239.5

        TreeSet<Student2> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
//        System.out.println(ts);
        for (Student2 t : ts) {
            System.out.print(t);
            System.out.println("，总分为：" + (t.getChinese()+t.getEnglish()+t.getMath()));
        }
    }
}
