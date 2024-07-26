package com.javastudy.demo.ApiDemoJDK8Date;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {

        //获取当前标准时间
        Instant now = Instant.now();
        System.out.println(now);

        //根据（秒/毫秒/纳秒）获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(2L);//毫秒
        System.out.println(instant1);

        Instant instant2 = Instant.ofEpochSecond(1L);
        System.out.println(instant2);

        Instant instant3 = Instant.ofEpochSecond(2L, 2L);//纳秒
        System.out.println(instant3);

        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //isXxx 判断
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        boolean result1 = instant4.isBefore(instant5);
        System.out.println(result1);

        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result2);

        //minusXxx plusXxx
        Instant instant6 = Instant.ofEpochMilli(3000L);
        Instant instant7 = instant6.minusMillis(3000L);
        Instant instant8 = instant6.plusMillis(3000L);
        System.out.println("instant7 = " +instant7);
        System.out.println("instant8 = " +instant8);

    }
}
