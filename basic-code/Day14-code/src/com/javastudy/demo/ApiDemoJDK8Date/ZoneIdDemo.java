package com.javastudy.demo.ApiDemoJDK8Date;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdDemo {
    public static void main(String[] args) {
        /*
        Date类：
        1.ZoneId：时区
        2.Instant：时间戳（世界标准时间）
        3.ZoneDateTime：带时区的时间

        日期格式化类：
        SimpleDateFormat：DateTimeFormatter 用于时间的格式化和解析

        日历类：
        Calendar：
        1.LocalDate：年、月、日
        2.LocalTime：时、分、秒
        3.LocalDateTime：年、月、日、时、分、秒

        工具类：
        1.Duration：时间间隔（秒，纳秒）
        2.Period：时间间隔（年，月，日）
        3.ChronoUnit：时间间隔（所有单位）
         */

        //获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());
        System.out.println(zoneIds);

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        //获取指定的时区
        ZoneId zoneId1 = ZoneId.of("Asia/Aden");
        System.out.println(zoneId1);
    }
}
