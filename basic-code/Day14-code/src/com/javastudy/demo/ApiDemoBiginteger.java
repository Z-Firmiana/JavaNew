package com.javastudy.demo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class ApiDemoBiginteger {
    public static void main(String[] args) {
        /*
            public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-11
            public BigInteger(String val) 获取指定的大整数
            public BigInteger(String val, int radix) 获取指定进制的大整数

            public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化
            细节:
            对象一旦创建里面的数据不能发生改变。
         */



        //获取随机大整数
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4,r);
        System.out.println(bd1);

        BigInteger bd2 = new BigInteger("273183718937819731731973289739127389127381371987391");
        System.out.println(bd2);

        /*
            public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化
            细节:
            1.对象一旦创建里面的数据不能发生改变。
            2.取值范围为long类型的范围
            3.对-16~16有优化，会提前先创建好BigInteger的对象，如果多次获取不会创建新的
         */

        System.out.println("valueOf：");
        BigInteger bd3 = BigInteger.valueOf(100);
        System.out.println(bd3);

        BigInteger bd4 = BigInteger.valueOf(16);
        BigInteger bd5 = BigInteger.valueOf(16);
        System.out.println(bd4 == bd5);

        /*
            public BigInteger add(BigInteger val) 加法
            public BigInteger subtract(BigInteger val) 减法
            public BigInteger multiply(BigInteger val) 乘法
            public BigInteger divide(BigInteger val) 除法，获取商
            public BigInteger[] divideAndRemainder(BigInteger val) 除法，获取商和余数
            public boolean equals(Object x) 比较是否相同
            public BigInteger pow(int exponent) 次幂
            public BigInteger max/min(BigInteger val) 返回较大值/较小值
            public int intValue(BigInteger val) 转为int类型整数，超出范围数据有误（longValue doubleValue）
         */

        BigInteger bd6 = BigInteger.valueOf(15); //节约内存
        BigInteger bd7 = BigInteger.valueOf(4);
        BigInteger[] arr = bd6.divideAndRemainder(bd7);
        System.out.println("divideAndRemainder：");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);


        System.out.println("equals：");
        System.out.println(bd6.equals(bd7));

        System.out.println("pow：");
        System.out.println(bd6.pow(4));

        System.out.println("max：");
        System.out.println(bd6.max(bd7));

        System.out.println("intValue：");
        BigInteger bd8 = BigInteger.valueOf(212323212322L);
        System.out.println(bd8.intValue());
    }

}
