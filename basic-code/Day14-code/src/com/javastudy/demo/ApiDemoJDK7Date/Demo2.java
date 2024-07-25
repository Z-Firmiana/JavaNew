package com.javastudy.demo.ApiDemoJDK7Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        /*
        SimpleDateFormat类
        1.格式化：把时间变成想要的格式
        2.解析：把字符串表示的时间变成Date对象

        y   年
        M   月
        d   日
        H   时
        m   分
        s   秒
        例：
        2023-11-11 13:27:06
        yyyy-MM-dd HH:mm:ss
         */


        //1.格式化
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println("默认格式：" + str1);

        method();


        //2.解析
        String str2 = "2023-11-11 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(str2);
        System.out.println(d2);

        //转换
        String str3 = "2000-11-11";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
        Date d3 = sdf3.parse(str3);

        SimpleDateFormat sdf3_1 = new SimpleDateFormat("yyyy年MM月dd日");
        String str3New = sdf3_1.format(d3);
        System.out.println(str3New);

        //练习：
        System.out.println("练习：");
        String start = "2023-11-11 00:00:00";
        String end = "2023-11-11 00:10:00";
        String jia = "2023-11-11 00:01:00";
        String pi = "2023-11-11 00:11:00";

        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date startDate = sdf4.parse(start);
        Date endDate = sdf4.parse(end);
        Date jiaDate = sdf4.parse(jia);
        Date piDate = sdf4.parse(pi);
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();
        long jiaTime = jiaDate.getTime();
        long piTime = piDate.getTime();

        if (jiaTime >= startTime && jiaTime <= endTime){
            System.out.println("小贾抢到了");
        } else {
            System.out.println("小贾失败了");
        }

        if (piTime >= startTime && piTime <= endTime){
            System.out.println("小皮抢到了");
        } else {
            System.out.println("小皮失败了");
        }

    }

    private static void method() {
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        Date d2 = new Date(0L);
        String str2 = sdf2.format(d2);
        System.out.println("修改后：" + str2);
    }
}
