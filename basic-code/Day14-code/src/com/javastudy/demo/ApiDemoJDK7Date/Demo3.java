package com.javastudy.demo.ApiDemoJDK7Date;

import java.util.Calendar;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) {
        /*
        Calendar类
        单独修改、获取时间中的年、月、日

        细节：是一个抽象类，不能直接创建对象，通过Calendar.getInstance()获取子类对象

        需求：将2023年09月10日增加一个月
         */

        Calendar c = Calendar.getInstance();

        //修改时间
        Date d = new Date(0L);
        c.setTime(d);

        /*
        细节：
        月份：范围0~11，需要加1
        星期：星期日是一周的第一天
              1（星期日）2（星期1）……
         */

        System.out.println(c);

        /*
        获取某个字段信息
        0：纪元
        1：年
        2：月
        3：一年中的第几周
        4：一个月中的第几周
        5: 一个月中的第几天(日期)
         */

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + "-" + month + "-" + date + " " + getWeek(week));

        //修改某个字段信息
        c.set(Calendar.YEAR, 2000);
        System.out.println(c.get(Calendar.YEAR));

    }

    public static String getWeek(int index) {
        //定义一个数组,让汉字星期几 跟1~7产生对应关系
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //根据索引返回对应的星期
        return arr[index];
    }
}
