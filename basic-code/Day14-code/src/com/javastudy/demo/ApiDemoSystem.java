package com.javastudy.demo;


public class ApiDemoSystem {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        /*
        基本数据类型，数据源和目的地类型必须保持一致
        需要考虑数组长度
        */
        System.arraycopy(arr1, 6, arr2, 2, 3);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "  ");
        }


    }
}
