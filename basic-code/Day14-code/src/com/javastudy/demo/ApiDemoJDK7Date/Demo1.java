package com.javastudy.demo.ApiDemoJDK7Date;

import java.util.Date;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        //需求1：打印时间原点开始一年之后的时间
        System.out.println("需求1：打印时间原点开始一年之后的时间");
        Date d1 = new Date(0L);
        long time = d1.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365; //1000L是防止结果超过int范围
        d1.setTime(time);
        System.out.println(d1);

        //需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        System.out.println("需求2：定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后");
        Random r = new Random();
        Date d2 = new Date(Math.abs(r.nextInt()));
        Date d3 = new Date(Math.abs(r.nextInt()));
        System.out.println(d2);
        System.out.println(d3);

        if (d2.getTime() > d3.getTime()) {
            System.out.println("d2："+ d2);
        } else if (d2.getTime() < d3.getTime()){
            System.out.println("d3：" + d3);
        } else {
            System.out.println("Same");
        }
    }
}
