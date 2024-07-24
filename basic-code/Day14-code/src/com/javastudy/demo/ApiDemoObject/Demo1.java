package com.javastudy.demo.ApiDemoObject;

public class Demo1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User user1 = new User(1, "张三", "1234qwer", "girl11", data);
//        System.out.println(user1.toString());
        Object user2 = user1.clone();
        /*
        克隆对象：
        1.重写clone方法
        2.让JavaBean类实现Cloneable接口
        3.创建源对象并调用clone
         */

//        System.out.println(user1);
//        System.out.println(user2);
        /*
        浅克隆：拷贝地址值
        深克隆：new新的数组，拷贝数据（String类型复用地址）
         */
        int[] arr = user1.getData();
        arr[0] = 100;
        System.out.println(user1);
        System.out.println(user2);
    }
}
