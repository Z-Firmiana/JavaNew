package com.javastudy.ArrayDemo;

import com.sun.security.jgss.GSSUtil;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
//        int[] arr1 = {11, 22, 33};
//        int[] arr4 = new int[] {1, 2, 3};
//        String[] arr2 = {"zhangsan", "lisi", "jkwaj"};
//        double[] arr3 = {1.62, 1.78, 1.90};
//        System.out.println(arr1);
//        System.out.println(arr2);
//        System.out.println(arr3);
//        System.out.println(arr4);
//        System.out.println(arr1[0]);
//        arr1[0] = 2;
//        System.out.println(arr1[0]);

//        int[] arr5 = {1, 2, 3, 4, 5};
//        for (int i = 0; i < arr5.length; i++) {
//            System.out.println(arr5[i]);
//          }
//        int sum = 0;
//        for (int i = 0; i < arr5.length; i++) {
//            sum += arr5[i];
//        }
//        System.out.println(sum);
//        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int count = 0;
//        for (int i = 0; i < arr6.length; i++) {
//            if (arr6[i] % 3 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
//        int[] arr7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        for (int i = 0; i < arr7.length; i++) {
//            if (arr7[i] % 2 != 0){
//                arr7[i] *= 2;
//            }else {
//                arr7[i] /= 2;
//            }
//        }
//        for (int i = 0; i < arr7.length; i++) {
//            System.out.println(arr7[i]);
//        }
//        String[] arr8 = new String[50];
//        int[] arr = new int[6];
//        Random r = new Random();
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = r.nextInt(100);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//        int[] arr = {2, 1, 3, 5, 4};
//        int sum = 0;
//        int count = 0;
//        for (int i = arr.length - 1; i >= 0; i--) {
//            sum += (int) (arr[i] * (Math.pow(10, count)));
//            count += 1;
//        }
//        System.out.println(sum);
//        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
//        int[] brr = new int[11];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int num = sc.nextInt();
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > num) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println("index = " + index);
//
//        for (int i = 0; i < brr.length; i++) {
//            if (i < index) {
//                brr[i] = arr[i];
//            } else {
//                brr[i] = arr[i-1];
//            }
//        }
//        brr[index] = num;
//        for (int i = 0; i < brr.length; i++) {
//            System.out.print(brr[i] + " ");
//        }
        int[] arr = new int[21];
        int[] brr = new int[21];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                brr[left] = arr[i];
                left++;
            } else {
                brr[right] = arr[i];
                right--;
            }
        }
        System.out.println("brr = ");
        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}
