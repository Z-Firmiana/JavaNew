package com.javastudy.demo;

import java.util.Arrays;

public class LambdaDemo2 {
    public static void main(String[] args) {
        /*
        Lambda表达式   () -> {}
        ()  对应着方法的形参
        ->  固定格式
        {}  对应着方法的方法体

        注意点：
        1.Lambda表达式可以用来简化匿名内部类的书写
        2.Lambda表达式只能简化函数式接口的匿名内部类的写法
        3.函数式接口：有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterfacee注解
         */
        method(() -> {
                System.out.println("游泳");
            }
        );

        /*
        lambda的省略规则：
        1.参数类型可以省略不写。
        2.如果只有一个参数，参数类型可以省略，同时()也可以省略。
        3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。
         */
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};
        // Lambda表达式完整格式
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
                    return o2 - o1;
                }
        );
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, ((o1, o2) -> o1 - o2));
        System.out.println(Arrays.toString(arr));

    }

    public static void method(Swim s) {
        s.swimming();
    }
}

interface Swim{
    public abstract void swimming();
}
