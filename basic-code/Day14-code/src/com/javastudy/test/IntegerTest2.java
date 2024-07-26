package com.javastudy.test;

public class IntegerTest2 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。要求:
        字符串中只能是数字不能有其他字符
        最少一位，最多10位0不能开头
         */

        String str1 = "123&";
        String str2 = "0231";
        String str3 = "";
        String str4 = "12345678901";
        String right = "12345";

        String regex = "[1-9]\\d{0,9}";

        int sum = 0;
        if (right.matches(regex)) {

            for (int i = 0; i < right.length(); i++) {
                sum = sum * 10 + (right.charAt(i) - '0');
            }
        } else {
            System.out.println("数据有误");
        }
        System.out.println(sum + 1);
    }
}
