package com.javastudy.demo;

public class BasicSearchDemo1 {
    public static void main(String[] args) {
        /*
        基本查找，也叫做顺序查找
        说明：顺序查找适合于存储结构为数组或者链表。

        基本思想：顺序查找也称为线形查找，属于无序查找算法。从数据结构线的一端开始，顺序扫描，依次将遍历到的结点与要查找的值相比较，若相等则表示查找成功；若遍历结束仍没有找到相同的，表示查找失败。

        需求：定义一个方法利用基本查找，查询某个元素是否存在
        数据如下：
        {131, 127, 147, 81, 103, 23, 7, 79}
         */
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int number = 811;
        System.out.println(basicSearch(arr, number));
    }

    private static boolean basicSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }


}
