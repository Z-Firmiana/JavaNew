package com.javastudy.demo;

import java.math.BigDecimal;

public class ApiDemoBigDecimal {
    public static void main(String[] args) {
        /*
            构造方法获取BigDecimal对象
            1.public BigDecimal(double val)：不够精确，不推荐使用
            2.public BigDecimal(string val)

            静态方法获取BigDecimal对象
            public static BigDecimal valueOf(double val)
            细节:
            1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
            2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
            3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new

            public BigDecimal add(BigDecimal val) 加法
            public BigDecimal subtract(BigDecimal val) 减法
            public BigDecimal multiply(BigDecimal val) 乘法
            public BigDecimal divide(BigDecimal val) 除法
            public BigDecimal divide(BigDecimal val，精确几位，舍入模式)除法
         */

        BigDecimal bd1 = new BigDecimal("0.01");
        BigDecimal bd2 = new BigDecimal("0.09");
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd3);
    }
}
