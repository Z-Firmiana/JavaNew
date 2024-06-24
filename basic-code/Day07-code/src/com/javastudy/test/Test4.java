package com.javastudy.test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        //定义一个能输入数组的方法
//        int[] grade = {70, 85, 76, 80, 90, 91};
        int[] grade = getScore(6);
        double max = grade[0];
        double min = grade[0];
        //求最大值
        max = getMax(grade, max);
        //求最小值
        min = getMin(grade, min);
        double avg = 0;
        double sum = 0;
        for (int i = 0; i < grade.length; i++) {
            sum += grade[i];
        }
        avg = (sum - max - min) / (grade.length - 2);
        System.out.println(avg);
    }

    public static double getMin(int[] grade, double min) {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] < min) {
                min = grade[i];
            }
        }
        return min;
    }

    public static double getMax(int[] grade, double max) {
        for (int i = 0; i < grade.length; i++) {
            if (grade[i] > max) {
                max = grade[i];
            }
        }
        return max;
    }

    public static int[] getScore(int num) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < num; ) {
            System.out.println("请输入第" + (i+1) + "个评委成绩：");
            int score = sc.nextInt();
            if (score >=0 && score <=100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("成绩超出范围，重新输入！");
            }
        }
        return arr;
    }

}
