package com.javastudy.demo;

public class RecursionSortDemo1 {
    public static void main(String[] args) {
        /*
        递归算法：
        指的是方法中调用方法本身的现象。

        注意点：
        递归一定要有出口，否则就会出现内存溢出

        作用：
        把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解。
        递归策略只需要少量的程序就可以描述出解题过程所需要的多次重复计算

        核心：
        1.找出口：什么时候不再调用
        2.找规则：怎么转化成小问题
         */

        /*
        需求1：递归求1~100之间的和
        大问题拆解成小问题
        1~100之间的和 = 100 + （1~99之间的和）
        1~99之间的和 = 99 + （1~98之间的和）
        1~98之间的和 = 98 + （1~97之间的和）
        …………
        1~2之间的和 = 2 + （1~1之间的和）
        1~1之间的和 = 1（递归的出口）
         */

        System.out.println(getSum(100));

        /*
        需求：利用递归求5的阶乘
        5! = 5 * 4 * 3 * 2 * 1
         */

        System.out.println(getFactorial(5));

    }

    private static int getFactorial(int i) {
        if (i == 1) {
            return 1;
        }
        return i * getFactorial(i - 1);
    }

    private static int getSum(int i) {
        if (i == 1) {
            return 1;
        }
        return i + getSum(i - 1);
    }
}
