package com.javastudy.a07extendsdemo7;

public class Test {
    public static void main(String[] args) {
        Maintainer mt = new Maintainer("001", "张三", "一号维修专员");
        System.out.println(mt.getId()+mt.getName()+mt.getWorkCon());
        mt.work();
    }
}
